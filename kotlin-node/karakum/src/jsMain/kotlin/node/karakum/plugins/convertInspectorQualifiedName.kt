package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

private val modules = setOf(
    "Console",
    "Debugger",
    "HeapProfiler",
    "Network",
    "NodeRuntime",
    "NodeTracing",
    "NodeWorker",
    "Profiler",
    "Runtime",
    "Schema",
    "Target",
)

val convertInspectorQualifiedName = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("inspector.d.ts"))

        nullable {
            ensure(isQualifiedName(node))

            val left = node.left
            ensure(isIdentifier(left))
            ensure(left.text in modules)

            "node.inspector.${left.text.replaceFirstChar { it.lowercase() }}.${render(node.right)}"
        } ?: nullable {
            ensure(isPropertyAccessExpression(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text in modules)

            "node.inspector.${expression.text.replaceFirstChar { it.lowercase() }}.${render(node.name)}"
        }
    }
}
