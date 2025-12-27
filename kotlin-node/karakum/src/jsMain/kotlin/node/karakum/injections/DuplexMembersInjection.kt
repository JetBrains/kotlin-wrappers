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
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.MEMBER
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.extension.plugins.lambda
import typescript.Node
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration
import typescript.isPropertyDeclaration

class DuplexMembersInjection : Injection {
    private val readableMemberNodes = mutableListOf<Node>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "Readable")

        ensureNotNull(
            nullable {
                ensure(isMethodDeclaration(node))

                val name = node.name
                ensure(isIdentifier(name))
                ensure(
                    name.text == "_construct"
                            || name.text == "_destroy"
                            || name.text == "destroy"
                )
            } ?: nullable {
                ensure(isPropertyDeclaration(node))

                val name = node.name
                ensure(isIdentifier(name))
                ensure(
                    name.text == "destroyed"
                            || name.text == "closed"
                            || name.text == "errored"
                )
            }
        )

        readableMemberNodes += node
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = null

    override fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "Duplex")
        ensure(context.type == InjectionType.MEMBER)

        readableMemberNodes
            .mapNotNull { member ->
                nullable {
                    ensure(isPropertyDeclaration(member))

                    "override ${render(member)}"
                } ?: nullable {
                    ensure(isMethodDeclaration(member))

                    val name = escapeIdentifier(render(member.name))

                    val typeParameters = member.typeParameters?.asArray()
                        ?.joinToString(", ") { render(it) }

                    val returnType = member.type?.let { render(it) }

                    nullable {
                        ensureNotNull(member.questionToken)

                        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

                        convertParameterDeclarations(
                            member, context, render,
                            ParameterDeclarationsConfiguration(
                                strategy = ParameterDeclarationStrategy.lambda,
                                template = { parameters, _ ->
                                    val functionType = when {
                                        member.typeParameters != null -> {
                                            "Function<Any?> /* ${typeScriptService.printNode(member)} */"
                                        }
                                        member.parameters.asArray().any { it.dotDotDotToken != null } -> {
                                            "Function<${returnType}> /* ${typeScriptService?.printNode(member)} */"
                                        }
                                        else -> {
                                            "(${parameters}) -> ${returnType ?: "Any?"}"
                                        }
                                    }

                                    "override val ${name}: (${functionType})?"
                                }
                            )
                        )
                    } ?: run {
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
            }
            .plus("override fun destroy(): Unit /* this */")
            .toTypedArray()
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
