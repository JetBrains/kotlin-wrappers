package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

private val modules = mapOf(
    "Console" to "console",
    "Debugger" to "debugger",
    "HeapProfiler" to "heapProfiler",
    "IO" to "io",
    "Network" to "network",
    "NodeRuntime" to "nodeRuntime",
    "NodeTracing" to "nodeTracing",
    "NodeWorker" to "nodeWorker",
    "Profiler" to "profiler",
    "Runtime" to "runtime",
    "Schema" to "schema",
    "Target" to "target",
)

val convertInspectorQualifiedName = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("inspector.generated.d.ts"))

        nullable {
            ensure(isQualifiedName(node))

            val left = node.left
            ensure(isIdentifier(left))
            ensure(left.text in modules)

            "node.inspector.${modules[left.text]}.${render(node.right)}"
        } ?: nullable {
            ensure(isPropertyAccessExpression(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text in modules)

            "node.inspector.${modules[expression.text]}.${render(node.name)}"
        }
    }
}
