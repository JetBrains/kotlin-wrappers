package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.*

private fun convertConstructSignatureDeclaration(
    node: SignatureDeclarationBase,
    context: Context,
    render: Render<Node>,
) = convertParameterDeclarations(
    node, context, render,
    ParameterDeclarationsConfiguration(
        strategy = ParameterDeclarationStrategy.function,
        template = { parameters, _ ->
            "constructor (${parameters})"
        }
    )
)

class BufferPlugin : Plugin {
    val bufferConstructorNodes = mutableListOf<InterfaceDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text == "BufferConstructor")

        bufferConstructorNodes += node
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        nullable {
            ensure(isVariableDeclaration(node))

            val name = node.name
            ensure(isIdentifier(name))
            ensure(name.text == "Buffer")

            ""
        } ?: nullable {
            ensure(isInterfaceDeclaration(node))
            ensure(node.name.text == "BufferConstructor")

            ""
        } ?: nullable {
            ensure(isInterfaceDeclaration(node))
            ensure(node.name.text == "Buffer")

            val declarationMergingService =
                ensureNotNull(context.lookupService<DeclarationMergingService>(declarationMergingServiceKey))

            nullable {
                ensure(declarationMergingService.isCovered(node))
                ""
            } ?: nullable {
                declarationMergingService.cover(node)

                val namespaceInfoService =
                    ensureNotNull(context.lookupService<NamespaceInfoService>(namespaceInfoServiceKey))

                val inheritanceModifierService =
                    ensureNotNull(context.lookupService<InheritanceModifierService>(inheritanceModifierServiceKey))

                val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node, context)

                val typeParameters = (
                        declarationMergingService.getTypeParameters(node)
                            ?: node.typeParameters?.asArray()
                        )
                    ?.map { next(it) }
                    ?.filter { it.isNotEmpty() }
                    ?.joinToString(", ")

                val heritageClauses = (
                        declarationMergingService.getHeritageClauses(node)
                            ?: node.heritageClauses?.asArray()
                        )
                    ?.map { next(it) }
                    ?.filter { it.isNotEmpty() }
                    ?.joinToString(", ")

                val constructors = bufferConstructorNodes
                    .flatMap { it.members.asArray().asIterable() }
                    .mapNotNull { member ->
                        nullable {
                            ensure(isConstructSignatureDeclaration(member))
                            convertConstructSignatureDeclaration(member, context, next)
                        }
                    }
                    .joinToString("\n")

                val resolveNamespaceStrategy = namespaceInfoService::resolveNamespaceStrategy

                val members = (
                        declarationMergingService.getMembers(node, resolveNamespaceStrategy)
                            ?: node.members.asArray()
                        )
                    .map { member ->
                        nullable {
                            ensure(isMethodSignature(member))

                            val memberName = member.name
                            ensure(isIdentifier(memberName))
                            ensure(memberName.text == "reverse")

                            ""
                        } ?: run {
                            next(member)
                        }
                    }
                    .filter { it.isNotEmpty() }
                    .joinToString("\n")

                val staticMembers = bufferConstructorNodes
                    .flatMap { it.members.asArray().asIterable() }
                    .mapNotNull { member ->
                        nullable {
                            ensure(!isConstructSignatureDeclaration(member))
                            next(member)
                        }
                    }
                    .joinToString("\n")

                val companionObject = """
                    companion object {
                    $staticMembers
                    }
                """.trimIndent()

                """
                    ${ifPresent(inheritanceModifier) { "$it " }}external class Buffer${ifPresent(typeParameters) { "<${it}>"}}${ifPresent(heritageClauses) { " : $it"}} {
                    $constructors
                    $members
                    $companionObject
                    }
                """.trimIndent()
            }
        }
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()

}
