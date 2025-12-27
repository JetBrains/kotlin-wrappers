package node.karakum.injections

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Injection
import io.github.sgrishchenko.karakum.extension.InjectionContext
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.MEMBER
import io.github.sgrishchenko.karakum.extension.plugins.function
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isPropertySignature

class FsStatsMembersInjection : Injection {
    private val statsBaseNodes = mutableListOf<Node>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("fs.d.ts"))

        nullable {
            ensure(isMethodSignature(node))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "StatsBase")

            statsBaseNodes += node
        } ?: nullable {
            ensure(isPropertySignature(node))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "StatsBase")

            statsBaseNodes += node
        }
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = null

    override fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("fs.d.ts"))

        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "Stats")

        statsBaseNodes
            .mapNotNull { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val readonly = member.modifiers?.asArray()?.find { it.kind == SyntaxKind.ReadonlyKeyword }

                    val modifier = if (readonly != null) "val " else "var "

                    val name = render(member.name)

                    val isOptional = member.questionToken != null

                    var type = renderNullable(member.type, isOptional, context, render)

                    if (type == "T") {
                        type = "Double"
                    }

                    "override ${modifier}${name}: $type"
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
