package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertToPrimitiveSymbolHolder = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeLiteralNode(node))

        val members = node.members.asArray()
        ensure(members.size == 1)

        val member = members.first()
        ensure(isMethodSignature(member))

        val name = member.name
        ensure(isComputedPropertyName(name))

        val expression = name.expression
        ensure(isPropertyAccessExpression(expression))

        val expressionNode = expression.expression
        ensure(isIdentifier(expressionNode))
        ensure(expressionNode.text == "Symbol")

        val identifier = expression.name
        ensure(isIdentifier(identifier))
        ensure(identifier.text == "toPrimitive")

        "js.symbol.ToPrimitiveSymbolHolder"
    }
}
