package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isPropertyAccessExpression
import typescript.ast.`is`.isQualifiedName

val convertWebStreamsQualifiedName = createPlugin { node, context, render ->
    nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "streamWeb")

        "web.streams.${render(node.right)}"
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "streamWeb")

        "web.streams.${render(node.name)}"
    }
}
