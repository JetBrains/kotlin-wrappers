package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import js.array.ReadonlyArray
import typescript.*

private fun filterMembers(
    members: ReadonlyArray<NamedDeclaration>,
    omitKeys: Set<String>,
): List<NamedDeclaration> {
    return members.mapNotNull {
        nullable {
            val name = ensureNotNull(it.name)
            ensure(isIdentifier(name))
            ensure(name.text !in omitKeys)

            it
        } ?: nullable {
            val name = it.name
            ensure(name == null || !isIdentifier(name))

            it
        }
    }
}

private fun extractMembersAndHeritageTypes(
    node: Node,
    context: Context,
    render: Render<Node>,
    reference: String? = null,
    omitKeys: Set<String>,
): Pair<List<String>, Set<String>> {
    val typeScriptService = context.lookupService<TypeScriptService>(typeScriptServiceKey)

    return nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Omit")

        val firstTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.getOrNull(0))

        val secondTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.getOrNull(1))

        val nextOmitKeys = omitKeys + (
                nullable {
                    ensure(isLiteralTypeNode(secondTypeArgument))

                    val literal = secondTypeArgument.literal
                    ensure(isStringLiteral(literal))

                    setOf(literal.text)
                } ?: nullable {
                    ensure(isUnionTypeNode(secondTypeArgument))
                    ensure(secondTypeArgument.types.asArray().all {
                        nullable {
                            ensure(isLiteralTypeNode(it))

                            val literal = it.literal
                            ensure(isStringLiteral(literal))
                        } != null
                    })

                    secondTypeArgument.types.asArray().mapNotNull {
                        nullable {
                            ensure(isLiteralTypeNode(it))

                            val literal = it.literal
                            ensure(isStringLiteral(literal))

                            literal.text
                        }
                    }
                } ?: emptySet<String>().also {
                    console.error("Unhandled second argument of Omit: ${typeScriptService?.printNode(secondTypeArgument)}")
                }
        )

        extractMembersAndHeritageTypes(firstTypeArgument, context, render, null, nextOmitKeys)
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val reference = render(node)

        if (omitKeys.isEmpty()) {
            emptyList<String>() to setOf(reference)
        } else {
            val typeChecker = ensureNotNull(typeScriptService?.program?.getTypeChecker())

            val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(node.typeName))

            symbol.valueDeclaration?.let {
                console.error("Unhandled class in Omit resolution: ${typeScriptService.printNode(node)}")
            }

            val declaration = ensureNotNull(symbol.declarations?.firstOrNull())

            extractMembersAndHeritageTypes(declaration, context, render, reference, omitKeys)
        }
    } ?: nullable {
        ensure(isTypeLiteralNode(node))

        val members = filterMembers(node.members.asArray(), omitKeys)

        members.map { render(it) } to emptySet()
    } ?: nullable {
        ensure(isInterfaceDeclaration(node))

        val namespaceInfoService =
            ensureNotNull(context.lookupService<NamespaceInfoService>(namespaceInfoServiceKey))

        val declarationMergingService =
            ensureNotNull(context.lookupService<DeclarationMergingService>(declarationMergingServiceKey))

        val members = declarationMergingService
            .getMembers(node) { namespaceInfoService.resolveNamespaceStrategy(it) }
            // TODO: fix in Karakum
            .unsafeCast<ReadonlyArray<NamedDeclaration>>()

        val filteredMembers = filterMembers(members, omitKeys)

        if (filteredMembers.size == members.size) {
            val heritageTypes = reference
                ?.let { setOf(it) }
                ?: emptySet()

            emptyList<String>() to heritageTypes
        } else {
            val heritageClauses = declarationMergingService.getHeritageClauses(node)
                ?.map { render(it) }
                ?.toSet()
                ?: emptySet()

            filteredMembers.map { render(it) } to heritageClauses
        }
    } ?: run {
        console.error("Unhandled type in Omit resolution: ${typeScriptService?.printNode(node)}")

        emptyList<String>() to emptySet()
    }
}

val convertOmittedTypeAlias = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "ExecFileException")

        val type = node.type
        ensure(isIntersectionTypeNode(type))
        ensure(type.types.asArray().all {
            isTypeReferenceNode(it)
                    || isTypeLiteralNode(it)
        })
        ensure(type.types.asArray().any {
            nullable {
                ensure(isTypeReferenceNode(it))

                val typeName = it.typeName
                ensure(isIdentifier(typeName))
                ensure(typeName.text == "Omit")
            } != null
        })

        val typeParameters = node.typeParameters?.asArray()
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(separator = ", ")

        val name = render(node.name)

        val inheritanceModifierService = context.lookupService<InheritanceModifierService>(inheritanceModifierServiceKey)
        val inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        val injectionService = context.lookupService<InjectionService>(injectionServiceKey)
        val heritageInjections = injectionService?.resolveInjections(node, InjectionType.HERITAGE_CLAUSE, context, render)
        val injections = injectionService?.resolveInjections(node, InjectionType.MEMBER, context, render)

        val (members, heritageTypes) = type.types.asArray()
            .fold(emptyList<String>() to emptySet<String>()) { acc, type ->
                val (members, heritageTypes) = extractMembersAndHeritageTypes(type, context, render, null, emptySet())
                (acc.first + members) to (acc.second + heritageTypes)
            }
            .let { acc ->
                val members = acc.first.joinToString(separator = "\n")

                val heritageTypes = acc.second
                    .filter { it.isNotEmpty() }
                    .joinToString(separator = ",")

                members to heritageTypes
            }

        val injectedMembers = (injections ?: emptyArray()).joinToString(separator = "\n")

        val injectedHeritageClauses = heritageInjections
            ?.filter { it.isNotEmpty() }
            ?.joinToString(separator = ", ")

        val fullHeritageClauses = arrayOf(heritageTypes, injectedHeritageClauses ?: "")
            .filter { it.isNotEmpty() }
            .joinToString(separator = ", ")

        """
            ${ifPresent(inheritanceModifier) { "$it "}}external interface ${name}${ifPresent(typeParameters) { "<${it}>"}}${(ifPresent(fullHeritageClauses) { ": $it"})} {
            ${members}${ifPresent(injectedMembers) { "\n${it}" }}
            }
        """.trimIndent()
    }
}
