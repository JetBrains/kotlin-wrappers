package electron.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertErrorTypeReferenceNode = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Error")

        "js.errors.JsError"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "Error")

        "js.errors.JsError"
    }
}
