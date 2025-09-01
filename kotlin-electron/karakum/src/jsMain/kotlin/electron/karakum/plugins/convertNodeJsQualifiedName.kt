package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

val convertNodeJsQualifiedName = createPlugin { node, _, render ->
    nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "NodeJS")

        when (node.right.text) {
            "EventEmitter" -> "node.events.EventEmitter"
            else -> "node.${render(node.right)}"
        }
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression =  node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "NodeJS")

        val name =  node.name
        ensure(isIdentifier(name))

        when (name.text) {
            "EventEmitter" -> "node.events.EventEmitter"
            else -> "node.${render(name)}"
        }
    }
}
