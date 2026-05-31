package wrappersgenerator.node.injections

import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

class WritableMembersInjection : Injection {
    private val writableStreamMemberNodes = mutableListOf<Node>()

    override suspend fun setup(context: Context) = Unit

    override suspend fun traverse(node: Node, context: Context) = impure {
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

    override suspend fun render(node: Node, context: Context, next: Render<Node>) = null

    override suspend fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
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
                        ?.map { render(it) }
                        ?.joinToString(", ")

                    val returnType = member.type?.let { render(it) }

                    convertParameterDeclarations(
                        member, context, render,
                        ParameterDeclarationStrategy.function,
                        defaultValue = "",
                    ) { parameters, _ ->
                        "override fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it" }}"
                    }
                }
            }
            .toTypedArray()
    }

    override suspend fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
