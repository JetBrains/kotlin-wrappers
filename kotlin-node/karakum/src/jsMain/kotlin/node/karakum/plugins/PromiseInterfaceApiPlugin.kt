package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import typescript.MethodSignature
import typescript.Node
import typescript.asArray
import typescript.isIdentifier
import typescript.isMethodSignature
import typescript.isTypeReferenceNode

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

private fun convertAsyncMethod(node: MethodSignature, context: Context, render: Render<Node>): String {
    val name = escapeIdentifier(render(node.name))

    val typeParameters = node.typeParameters?.asArray()
        ?.joinToString(", ") { render(it) }

    val returnType = node.type ?.let { render(it) }

    val promiseDeclaration = convertParameterDeclarations(
        node, context, render,
        ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            template = { parameters, _ ->
                """
                    @JsName("$name")
                    fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Async(${parameters})${ifPresent(returnType) { ": $it" }}
                """.trimIndent()
            }
        )
    )

    val type = requireNotNull(node.type)
    require(isTypeReferenceNode(type))

    val typeArguments = requireNotNull(type.typeArguments)

    val returnTypePayload = render(typeArguments.asArray().first())

    val suspendDeclaration = convertParameterDeclarations(
        node, context, render,
        ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            template = { parameters, _ ->
                """
                    @seskar.js.JsAsync
                    suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnTypePayload) { ": $it"}}
                """.trimIndent()
            }
        )
    )

    return "${promiseDeclaration}\n\n${suspendDeclaration}"
}

val PromiseInterfaceApiPlugin = createPlugin { node, context, render ->
    nullable {
        ensure(isMethodSignature(node))

        val type = ensureNotNull(node.type)
        ensure(isPromiseType(type))

        convertAsyncMethod(node, context, render)
    }
}
