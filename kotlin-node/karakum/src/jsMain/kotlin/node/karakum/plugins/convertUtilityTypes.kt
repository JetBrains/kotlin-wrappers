package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

val convertUtilityTypes = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Partial" || typeName.text == "Pick" || typeName.text == "Omit")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    } ?:nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Awaited")

        val promiseType = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(promiseType))

        val promiseTypeName = promiseType.typeName
        ensure(isIdentifier(promiseTypeName))
        ensure(promiseTypeName.text == "Promise")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))

        ensure(expression.text == "Partial" || expression.text == "Pick" || expression.text == "Omit")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isPropertyAccessExpression(expression))

        val expressionName = expression.name
        ensure(isIdentifier(expressionName))
        ensure(expressionName.text == "PartialOptions")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    }
}
