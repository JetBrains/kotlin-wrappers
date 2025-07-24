package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.asArray
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertUtilityTypes = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Partial" || typeName.text == "Pick" || typeName.text == "Omit")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))

        ensure(expression.text == "Partial" || expression.text == "Omit")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    }
}
