package node.karakum.injections

import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.Raise
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.*

class WritableMembersInjection : Injection {
    private val writableStreamMemberNodes = mutableListOf<Node>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("globals.d.ts"))

        nullable {
            ensure(isMethodSignature(node))

            val name = ensureNotNull(node.name)
            ensure(isIdentifier(name))
            ensure(
                name.text == "write"
                        || (name.text == "end" && node.parameters.asArray().size > 1)
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "WritableStream")

            writableStreamMemberNodes += node
        } ?: nullable {
            ensure(isPropertySignature(node))

            val name = ensureNotNull(node.name)
            ensure(isIdentifier(name))
            ensure(name.text == "writable")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "WritableStream")

            writableStreamMemberNodes += node
        }

    }

    override fun render(node: Node, context: Context, next: Render<Node>) = null

    override fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "Writable")

        writableStreamMemberNodes
            .mapNotNull { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    "override ${render(member)}"
                } ?: nullable {
                    ensure(isMethodSignature(member))

                    val name = render(member.name)

                    val typeParameters = member.typeParameters?.asArray()
                        ?.joinToString(", ") { render(it) }

                    val returnType = member.type?.let { render(it) }

                    convertParameterDeclarations(
                        member, context, render,
                        ParameterDeclarationsConfiguration(
                            strategy = ParameterDeclarationStrategy.function,
                            defaultValue = "",
                            template = { parameters, _ ->
                                "override fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it" }}"
                            }
                        )
                    )
                }
            }
            .toTypedArray()
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
