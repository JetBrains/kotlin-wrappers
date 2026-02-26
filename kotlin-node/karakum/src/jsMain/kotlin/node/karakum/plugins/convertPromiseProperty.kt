package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import typescript.*

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

private fun convertAsyncSignature(
    name: String,
    node: SignatureDeclarationBase,
    context: Context,
    render: Render<Node>,
): String {
    val typeParameters = node.typeParameters?.asArray()
        ?.joinToString(", ") { render(it) }

    val returnType = node.type?.let { render(it) }

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

val convertPromiseProperty = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertyDeclaration(node))

        val type = ensureNotNull(node.type)

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        val name = escapeIdentifier(render(node.name))

        val propertyType = ensureNotNull(typeScriptService.resolveType(type) ?: node.type)

        nullable {
            ensure(isFunctionTypeNode(propertyType))
            ensure(isPromiseType(propertyType.type))

            convertAsyncSignature(name, propertyType, context, render)
        } ?: nullable {
            ensure(isTypeLiteralNode(propertyType))
            ensure(propertyType.members.asArray().all { member ->
                nullable {
                    ensure(isCallSignatureDeclaration(member))

                    val memberType = ensureNotNull(member.type)
                    ensure(isPromiseType(memberType))
                } != null
            })

            propertyType.members.asArray().joinToString("\n") { member ->
                require(isCallSignatureDeclaration(member))
                convertAsyncSignature(name, member, context, render)
            }
        }
    }
}
