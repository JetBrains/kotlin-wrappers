package testing.library.user.event.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

val convertUserEventMethod = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertySignature(node))

        val typeLiteral = ensureNotNull(node.getParentOrNull())
        ensure(isTypeLiteralNode(typeLiteral))

        val variable = ensureNotNull(typeLiteral.getParentOrNull())
        ensure(isVariableDeclaration(variable))

        val variableNameNode = variable.name
        ensure(isIdentifier(variableNameNode))
        ensure(variableNameNode.text == "userEvent")

        val type = ensureNotNull(node.type)
        ensure(isTypeQueryNode(type))

        val typeExpression = ensureNotNull(type.exprName)

        val typeExpressionName = when {
            isQualifiedName(typeExpression) -> typeExpression.right
            isIdentifier(typeExpression) -> typeExpression
            else -> raise()
        }

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        var symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeExpressionName))

        // TODO: provide bit mask for TypeFlags
        if ((symbol.flags.toString().toInt() and SymbolFlags.Alias.toString().toInt()) != 0) {
            symbol = typeChecker.getAliasedSymbol(symbol)
        }

        val declaration = ensureNotNull(symbol.declarations?.singleOrNull())
        ensure(isFunctionDeclaration(declaration))

        val name = render(node.name)

        val typeParameters = declaration.typeParameters
            ?.asArray()
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(separator = ", ")

        val declarationType = ensureNotNull(declaration.type)
        val renderedDeclarationType = render(declarationType)

        if (isPromiseType(declarationType)) {
            ensure(isTypeReferenceNode(declarationType))

            val promiseDeclaration = convertParameterDeclarations(
                declaration, context, render,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = { parameters, _ ->
                        """
                            @JsName("$name")
                            fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Async(${parameters})${ifPresent(renderedDeclarationType) { ": $it" }
                        }
                        """.trimIndent()
                    }
                )
            )

            val typeArguments = requireNotNull(declarationType.typeArguments)

            val returnTypePayload = render(typeArguments.asArray().first())

            val suspendDeclaration = convertParameterDeclarations(
                declaration, context, render,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = { parameters, _ ->
                        """
                            @seskar.js.JsAsync
                            suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnTypePayload) { ": $it" }
                        }
                        """.trimIndent()
                    }
                )
            )

            "${promiseDeclaration}\n\n${suspendDeclaration}"
        } else {
            convertParameterDeclarations(
                declaration, context, render,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = { parameters, _ ->
                        "fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(renderedDeclarationType) { ": $it" }}"
                    }
                )
            )
        }
    }
}
