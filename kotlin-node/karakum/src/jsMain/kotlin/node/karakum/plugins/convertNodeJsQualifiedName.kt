package node.karakum.plugins

import arrow.core.raise.nullable
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
            "Iterator" -> "js.iterable.JsIterator"
            "AsyncIterator" -> "js.iterable.AsyncIterator"
            "ArrayBufferView" -> "js.buffer.ArrayBufferView"
            "TypedArray" -> "js.typedarrays.TypedArray"

            "EventEmitter" -> "node.events.EventEmitter"

            "Module" -> "node.module.Module"
            "Require" -> "node.module.Require"

            "Process" -> "node.process.Process"
            "Signals" -> "node.process.Signals"
            "ProcessEnv" -> "node.process.ProcessEnv"
            "Platform" -> "node.process.Platform"
            "Architecture" -> "node.process.Architecture"
            else -> "node.${render(node.right)}"
        }
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression =  node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "NodeJS")

        "node.${render(node.name)}"
    }
}
