package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import typescript.*

private fun isConflictingOverload(node: FunctionDeclaration): Boolean =
    node.name?.text == "isMap"
            || node.name?.text == "isSet"

class ContractFunctionApiPlugin : Plugin {
    private val contractApiDeclarations = mutableListOf<DerivedDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = Unit

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        val namespace = typeScriptService.findClosestNamespace(node)

        ensure(isFunctionDeclaration(node))

        val type = ensureNotNull(node.type)
        ensure(isTypePredicateNode(type))

        // TODO: support asserts (returns() implies value)
        ensure(type.assertsModifier == null)

        val nameNode = ensureNotNull(node.name)

        val name = escapeIdentifier(next(nameNode))

        val typeParameters = node.typeParameters?.asArray()
            ?.joinToString(", ") { next(it) }

        val returnType = next(type)

        val contractReturns = "returns(true)"

        val parameterName = escapeIdentifier(next(type.parameterName))

        val typeType = ensureNotNull(type.type)

        var contractType = next(typeType)

        if (name == "isWeakMap") {
            contractType = "js.collections.WeakMap<*, *>"
        }

        if (name == "isWeakSet") {
            contractType = "js.collections.WeakSet<*>"
        }

        val body = convertParameterDeclarations(
            node, context, next,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = template@{ parameters, signature ->
                    if (isConflictingOverload(node)) return@template ""

                    val parameterNames = signature
                        .withIndex()
                        .mapNotNull { (index, it) ->
                            nullable {
                                val parameterName = it.parameter.name

                                if (isIdentifier(parameterName)) {
                                    escapeIdentifier(next(parameterName))
                                } else {
                                    "param${index}"
                                }
                            }
                        }
                        .joinToString(", ")

                    """
                        @Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
                        inline fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it"}} {
                            contract {
                                $contractReturns implies (${parameterName} is ${contractType})
                            }

                            return ${name}Raw(${parameterNames})
                        }
                    """.trimIndent()
                }
            )
        )

        val nodeInfo = DerivedDeclaration(
            sourceFileName,
            namespace,
            fileName = "${name}.contract.kt",
            body,
        )

        contractApiDeclarations += nodeInfo

        convertParameterDeclarations(
            node, context, next,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = template@{ parameters, _ ->
                    if (isConflictingOverload(node)) return@template ""

                    """
                        @JsName("$name")
                        external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Raw(${parameters})${ifPresent(returnType) { ": $it" }}
                    """.trimIndent()
                }
            )
        )
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        return generateDerivedDeclarations(contractApiDeclarations.toTypedArray(), context)
    }

}
