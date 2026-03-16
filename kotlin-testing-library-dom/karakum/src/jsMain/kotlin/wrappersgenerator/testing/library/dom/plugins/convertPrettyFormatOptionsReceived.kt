package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isTypeReferenceNode

val convertPrettyFormatOptionsReceived = createPlugin { node, context, _ ->
    val typeScriptService = context.lookupService(typeScriptServiceKey)

    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "OptionsReceived")

        "Any /* TODO: ${typeScriptService?.printNode(node)} */"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isPropertyAccessExpression(expression))

        val name = expression.name
        ensure(isIdentifier(name))
        ensure(name.text == "OptionsReceived")

        val expressionExpression = expression.expression
        ensure(isIdentifier(expressionExpression))
        ensure(expressionExpression.text == "prettyFormat")

        // TODO: consider convertion of prettyFormat

        ""
    }
}
