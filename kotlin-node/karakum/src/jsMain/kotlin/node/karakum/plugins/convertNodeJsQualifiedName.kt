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
            "Architecture" -> "node.process.Architecture"
            "CpuUsage" -> "node.process.CpuUsage"
            "Platform" -> "node.process.Platform"
            "ProcessEnv" -> "node.process.ProcessEnv"
            "Signals" -> "node.process.Signals"
            else -> "node.${render(node.right)}"
        }
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "NodeJS")

        val name = node.name
        ensure(isIdentifier(name))

        when (name.text) {
            "ProcessEnv" -> "node.process.ProcessEnv"
            else -> "node.${render(node.name)}"
        }
    }
}
