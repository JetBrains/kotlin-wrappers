package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import typescript.*

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

private fun isPromiseFunction(node: Node) = nullable {
    ensure(isFunctionDeclaration(node))

    val type = ensureNotNull(node.type)
    ensure(isPromiseType(type))
} != null

private fun isIgnored(node: FunctionDeclaration) = nullable {
    val name = ensureNotNull(node.name)

    ensure(name.text == "waitFor")
} != null

class PromiseFunctionApiPlugin : Plugin {
    private val promiseApiDeclarations = mutableListOf<DerivedDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = Unit

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        val namespace = typeScriptService.findClosestNamespace(node)

        ensure(isFunctionDeclaration(node))
        ensure(isPromiseFunction(node))
        ensure(!isIgnored(node))

        val nameNode = ensureNotNull(node.name)

        val name = escapeIdentifier(next(nameNode))

        val typeParameters = node.typeParameters?.asArray()
            ?.joinToString(", ") { next(it) }

        val returnType = node.type?.let { next(it) }

        val type = requireNotNull(node.type)
        require(isTypeReferenceNode(type))

        val typeArguments = requireNotNull(type.typeArguments)

        val returnTypePayload = next(typeArguments.asArray().first())

        val body = convertParameterDeclarations(
            node, context, next,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = template@{ parameters, _ ->
                    """
                        @seskar.js.JsAsync
                        external suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnTypePayload) { ": $it"}}
                    """.trimIndent()
                }
            )
        )

        val nodeInfo = DerivedDeclaration(
            sourceFileName,
            namespace,
            fileName = "${name}.suspend.kt",
            body,
        )

        promiseApiDeclarations += nodeInfo

        convertParameterDeclarations(
            node, context, next,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = template@{ parameters, _ ->
                    """
                        @JsName("$name")
                        external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Async(${parameters})${ifPresent(returnType) { ": $it" }}
                    """.trimIndent()
                }
            )
        )
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        return generateDerivedDeclarations(promiseApiDeclarations.toTypedArray(), context)
    }
}
