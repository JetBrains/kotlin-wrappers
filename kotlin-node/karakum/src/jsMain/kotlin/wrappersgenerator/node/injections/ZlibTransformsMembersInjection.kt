package wrappersgenerator.node.injections

import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

private val zlibTransforms = setOf(
    "BrotliCompress",
    "BrotliDecompress",
    "Deflate",
    "DeflateRaw",
    "Gunzip",
    "Gzip",
    "Inflate",
    "InflateRaw",
    "Unzip",
    "ZstdCompress",
    "ZstdDecompress",
)

private val zlibResetTransforms = setOf(
    "Deflate",
    "DeflateRaw",
    "Inflate",
    "InflateRaw",
)

private val zlibParamsTransforms = setOf(
    "Deflate",
    "DeflateRaw",
)

class ZlibTransformsMembersInjection : Injection {
    private val zlibMemberNodes = mutableListOf<Node>()
    private val zlibResetMemberNodes = mutableListOf<Node>()
    private val zlibParamsMemberNodes = mutableListOf<Node>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("zlib.d.ts"))

        ensure(isMethodSignature(node) || isPropertySignature(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))

        when (interfaceNode.name.text) {
            "Zlib" -> zlibMemberNodes += node
            "ZlibReset" -> zlibResetMemberNodes += node
            "ZlibParams" -> zlibParamsMemberNodes += node
        }
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = null

    override fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("zlib.d.ts"))

        ensure(isClassDeclaration(node))
        ensure(context.type == InjectionType.MEMBER)
        ensure(
            node.name?.text in zlibTransforms
                    || node.name?.text in zlibResetTransforms
                    || node.name?.text in zlibParamsTransforms
        )

        listOfNotNull(
            zlibMemberNodes.takeIf { node.name?.text in zlibTransforms },
            zlibResetMemberNodes.takeIf { node.name?.text in zlibResetTransforms },
            zlibParamsMemberNodes.takeIf { node.name?.text in zlibParamsTransforms },
        )
            .flatten()
            .mapNotNull { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    "override ${render(member)}"
                } ?: nullable {
                    ensure(isMethodSignature(member))

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
                                            "Function<${returnType}> /* ${typeScriptService.printNode(member)} */"
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
            .toTypedArray()
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
