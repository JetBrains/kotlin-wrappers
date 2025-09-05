package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.InterfaceDeclaration
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isComputedPropertyName
import typescript.isConstructorDeclaration
import typescript.isGetAccessorDeclaration
import typescript.isIdentifier
import typescript.isIndexSignatureDeclaration
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isMethodDeclaration
import typescript.isMethodSignature
import typescript.isModuleBlock
import typescript.isModuleDeclaration
import typescript.isParameter
import typescript.isPropertyDeclaration
import typescript.isQualifiedName
import typescript.isSetAccessorDeclaration
import typescript.isTypeReferenceNode

private fun extractModifiers(member: Node) = when {
    isPropertyDeclaration(member) -> member.modifiers
    isMethodDeclaration(member) -> member.modifiers
    isConstructorDeclaration(member) -> member.modifiers
    isGetAccessorDeclaration(member) -> member.modifiers
    isSetAccessorDeclaration(member) -> member.modifiers
    isIndexSignatureDeclaration(member) -> member.modifiers
    else -> null
}?.asArray() ?: emptyArray()

private fun isEventEmitterInterfaceNode(node: Node) = nullable {
    ensure(isInterfaceDeclaration(node))
    ensure(node.name.text == "EventEmitter")

    val moduleBlock = ensureNotNull(node.getParentOrNull())
    ensure(isModuleBlock(moduleBlock))

    val moduleDeclaration = ensureNotNull(moduleBlock.getParentOrNull())
    ensure(isModuleDeclaration(moduleDeclaration))

    val moduleName = moduleDeclaration.name
    ensure(isIdentifier(moduleName))
    ensure(moduleName.text == "NodeJS")
} != null

private fun  isEventEmitterClassNode(node: Node) = nullable {
    ensure(isClassDeclaration(node))
    ensure(node.name?.text == "EventEmitter")
} != null

class EventEmitterPlugin : Plugin {
    private lateinit var eventEmitterInterfaceNode: InterfaceDeclaration

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isInterfaceDeclaration(node))
        ensure(isEventEmitterInterfaceNode(node))

        eventEmitterInterfaceNode = node
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("events.d.ts"))

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Key")

            "EventType"
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull(1))
            ensure(isTypeReferenceNode(secondType))

            val typeName = secondType.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Key2")

            "EventType"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(
                typeName.text == "Listener1"
                        || typeName.text == "Listener2"
            )

            "EventListener"
        } ?: nullable {
            ensure(isIdentifier(node))
            ensure(node.text == "eventName")

            val parameter = ensureNotNull(node.getParentOrNull())
            ensure(isParameter(parameter))
            ensure(parameter.name === node)

            val method = ensureNotNull(parameter.getParentOrNull())
            ensure(
                isMethodDeclaration(method)
                        || isMethodSignature(method)
            )

            "type"
        } ?: nullable {
            ensure(isMethodDeclaration(node))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isEventEmitterClassNode(classNode))

            nullable {
                ensure(isComputedPropertyName(node.name))

                "/* ${typeScriptService.printNode(node)} */"
            } ?: nullable {
                val name = next(node.name)

                val returnType = node.type?.let { next(it) }

                convertParameterDeclarations(
                    node, context, next,
                    ParameterDeclarationsConfiguration(
                        strategy = ParameterDeclarationStrategy.function,
                        template = { parameters, signature ->
                            nullable {
                                ensure(signature.any { it.type?.kind == SyntaxKind.SymbolKeyword })

                                ""
                            } ?: nullable {
                                ensure(signature.size == 3)

                                val firstParameter = signature.first()

                                val firstParameterType = ensureNotNull(firstParameter.type)
                                ensure(isTypeReferenceNode(firstParameterType))

                                val firstParameterTypeName = firstParameterType.typeName
                                ensure(isQualifiedName(firstParameterTypeName))
                                ensure(firstParameterTypeName.right.text == "EventEmitter")

                                val enhancedReturnType = if (name == "once") "Promise<P>" else "AsyncIterator<P>"

                                "fun <P : Tuple> ${name}(emitter: EventEmitter, type: EventType, options: StaticEventEmitterOptions = definedExternally): $enhancedReturnType"
                            } ?: nullable {
                                ensure(signature.size == 3)

                                val firstParameter = signature.first()

                                val firstParameterType = ensureNotNull(firstParameter.type)
                                ensure(isTypeReferenceNode(firstParameterType))

                                val firstParameterTypeName = firstParameterType.typeName
                                ensure(isIdentifier(firstParameterTypeName))
                                ensure(firstParameterTypeName.text == "EventTarget")

                                val enhancedReturnType = if (name == "once") "Promise<Tuple1<E>>" else "AsyncIterator<Tuple1<E>>"

                                "fun <E : Event> ${name}(emitter: EventTarget, type: web.events.EventType<E>, options: StaticEventEmitterOptions = definedExternally): $enhancedReturnType"
                            } ?: nullable {
                                ensure(signature.size == 2)

                                val firstParameter = signature.first()

                                val firstParameterType = ensureNotNull(firstParameter.type)
                                ensure(isTypeReferenceNode(firstParameterType))

                                val firstParameterTypeName = firstParameterType.typeName
                                ensure(isQualifiedName(firstParameterTypeName))
                                ensure(firstParameterTypeName.right.text == "EventEmitter")

                                "fun ${name}(emitter: EventEmitter, type: EventType)${ifPresent(returnType, { ": $it" })}"
                            } ?: nullable {
                                ensure(signature.size == 2)

                                val firstParameter = signature.first()

                                val firstParameterType = ensureNotNull(firstParameter.type)
                                ensure(isTypeReferenceNode(firstParameterType))

                                val firstParameterTypeName = firstParameterType.typeName
                                ensure(isIdentifier(firstParameterTypeName))
                                ensure(firstParameterTypeName.text == "EventTarget")

                                "fun ${name}(emitter: EventTarget, type: web.events.EventType<*>)${ifPresent(returnType, { ": $it" })}"
                            } ?: run {
                                // remove generics
                                "fun ${name}(${parameters})${ifPresent(returnType, { ": $it" })}"
                            }
                        }
                    )
                )
            }
        } ?: nullable {
            ensure(isMethodSignature(node))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isEventEmitterInterfaceNode(interfaceNode))

            nullable {
                ensure(isComputedPropertyName(node.name))

                "/* ${typeScriptService.printNode(node)} */"
            } ?: nullable {
                val name = next(node.name)

                val returnType = node.type?.let { next(it) }

                convertParameterDeclarations(
                    node, context, next,
                    ParameterDeclarationsConfiguration(
                        strategy = ParameterDeclarationStrategy.function,
                        template = { parameters, _ ->
                            // remove generics
                            "fun ${name}(${parameters})${ifPresent(returnType, { ": $it" })}"
                        }
                    )
                )
            }
        } ?: nullable {
            ensure(isClassDeclaration(node))
            ensure(node.name?.text == "EventEmitter")

            val heritageClauses = node.heritageClauses?.asArray()
                ?.joinToString(", ") { next(it) }

            val members = node.members.asArray()
                .filter { member -> extractModifiers(member).all { it.kind != SyntaxKind.StaticKeyword } }
                .plus(eventEmitterInterfaceNode.members.asArray())
                .joinToString("\n") { next(it) }

            val staticMembers = node.members.asArray()
                .filter { member -> extractModifiers(member).any { it.kind == SyntaxKind.StaticKeyword } }
                .joinToString("\n") { next(it) }

            val companionObject = """
                companion object {
                $staticMembers
                }
            """.trimIndent()

            """
                open external class EventEmitter${ifPresent(heritageClauses, { " : $it" })} {
                $members
                $companionObject
                }
            """.trimIndent()
        }
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
