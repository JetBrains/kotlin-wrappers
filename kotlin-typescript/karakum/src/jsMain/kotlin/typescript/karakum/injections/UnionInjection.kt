package typescript.karakum.injections

import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

private fun isNodeSuccessor(node: Node, context: Context): Boolean = nullable {
    val name = ensureNotNull(
        when {
            isTypeReferenceNode(node) -> node.typeName
            isExpressionWithTypeArguments(node) -> node.expression
            else -> null
        }
    )

    nullable {
        ensure(isIdentifier(name))
        ensure(name.text == "Node")
    } ?: nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))
        val declarations = ensureNotNull(symbol.declarations)

        ensure(declarations.any { declaration ->
            nullable {
               nullable {
                   ensure(isInterfaceDeclaration(declaration))

                   ensure(
                       (declaration.heritageClauses?.asArray() ?: emptyArray())
                           .flatMap { it.types.asArray().asIterable() }
                           .any { isNodeSuccessor(it, context) }
                   )
               } ?: nullable {
                   ensure(isTypeAliasDeclaration(declaration))

                   val declarationType = declaration.type

                   nullable {
                       ensure(isIntersectionTypeNode(declarationType))
                       ensure(declarationType.types.asArray().any { isNodeSuccessor(it, context) })
                   } ?: nullable {
                       ensure(isUnionTypeNode(declarationType))
                       ensure(declarationType.types.asArray().all { isNodeSuccessor(it, context) })
                   } ?: nullable {
                       ensure(isNodeSuccessor(declarationType, context))
                   }
               }
            } != null
        })
    }
} != null

private fun isEnumMemberType(node: Node, context: Context, enumName: String): Boolean = nullable {
    ensure(isTypeReferenceNode(node))
    val name = node.typeName

    nullable {
        ensure(isQualifiedName(name))

        val left = name.left
        ensure(isIdentifier(left))
        ensure(left.text == enumName)
    } ?: nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))
        val declarations = ensureNotNull(symbol.declarations)

        ensure(declarations.any { declaration ->
            nullable {
                ensure(isTypeAliasDeclaration(declaration))

                val declarationType = declaration.type

                nullable {
                    ensure(isUnionTypeNode(declarationType))
                    ensure(declarationType.types.asArray().all { isEnumMemberType(it, context, enumName) })
                } ?: nullable {
                    ensure(isEnumMemberType(declaration.type, context, enumName))
                }
            } != null
        })
    }
} != null

val injectCommonUnionParents = createInjection { node, context, _, ->
    val result = mutableListOf<String>()

    for (enumName in setOf("SyntaxKind", "ScriptKind", "CommandTypes")) {
        if (
            context.type == InjectionType.HERITAGE_CLAUSE
            && isUnionTypeNode(node)
            && node.types.asArray().all { isEnumMemberType(it, context, enumName) }
        ) {
            result.add(enumName)
        }
    }

    if (
        context.type == InjectionType.HERITAGE_CLAUSE
        && isUnionTypeNode(node)
        && node.types.asArray().all { isNodeSuccessor(it, context) }
    ) {
        result.add("Node")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(
            typeAlias.name.text == "ModuleExportName"
                    || typeAlias.name.text == "BindingName"
                    || typeAlias.name.text == "MemberName"
        )

        result.add("DeclarationName")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "ModuleName")

        result.add("DeclarationStatementName")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(
            typeAlias.name.text == "KeywordTypeSyntaxKind"
                    || typeAlias.name.text == "ModifierSyntaxKind"
        )

        result.add("KeywordSyntaxKind")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "JsonObjectExpression")

        result.add("Expression")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "EntityNameExpression")

        result.add("LeftHandSideExpression")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "ObjectLiteralElementLike")

        result.add("ObjectLiteralElement")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val property = ensureNotNull(node.getParentOrNull())
        ensure(isPropertySignature(property))

        val propertyName = property.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text == "name")

        val interfaceNode = ensureNotNull(property.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "DeclarationStatement")

        result.add("DeclarationName")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val property = ensureNotNull(node.getParentOrNull())
        ensure(isPropertySignature(property))

        val propertyName = property.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text == "expression")

        val interfaceNode = ensureNotNull(property.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "JsxTagNamePropertyAccess")

        result.add("LeftHandSideExpression")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val property = ensureNotNull(node.getParentOrNull())
        ensure(isPropertySignature(property))

        val propertyName = property.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text == "expression")

        val interfaceNode = ensureNotNull(property.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "ImportCall")

        result.add("LeftHandSideExpression")
    }

    impure {
        ensure(context.type == InjectionType.HERITAGE_CLAUSE)
        ensure(isUnionTypeNode(node))

        val subProperty = ensureNotNull(node.getParentOrNull())
        ensure(isPropertySignature(subProperty))

        val subPropertyName = subProperty.name
        ensure(isIdentifier(subPropertyName))
        ensure(subPropertyName.text == "expression")

        val typeLiteral = ensureNotNull(subProperty.getParentOrNull())
        ensure(isTypeLiteralNode(typeLiteral))

        val intersection = ensureNotNull(typeLiteral.getParentOrNull())
        ensure(isIntersectionTypeNode(intersection))

        val property = ensureNotNull(intersection.getParentOrNull())
        ensure(isPropertySignature(property))

        val propertyName = property.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text == "class")

        val interfaceNode = ensureNotNull(property.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(
            interfaceNode.name.text == "JSDocAugmentsTag"
                    || interfaceNode.name.text == "JSDocImplementsTag"
        )

        result.add("LeftHandSideExpression")
    }

    result.toTypedArray()
}

fun decorateUnionInjection(unionInjection: Injection): Injection {
    return object : Injection by unionInjection {
        override fun inject(node: Node, context: InjectionContext, render: Render<Node>) =
            unionInjection.inject(node, context, render)
                ?.filter {
                    it != "EditorSettingsIndentStyle"
                            && it != "FormatCodeSettingsIndentStyle"
                            && it != "ExternalFileScriptKind"
                            && it != "CompilerOptionsModule"
                            && it != "CompilerOptionsJsx"
                            && it != "CompilerOptionsModuleResolution"
                            && it != "CompilerOptionsNewLine"
                            && it != "CompilerOptionsTarget"
                            && it != "ConvertScriptKindNameResult"
                            && it != "WatchOptionsFallbackPolling"
                            && it != "WatchOptionsWatchDirectory"
                            && it != "WatchOptionsWatchFile"
                            && it != "CustomTransformersAfterDeclarationsItemTypeArgument"
                            && it != "ElementWithComputedPropertyNameBase"
                }
                ?.toTypedArray()
    }
}
