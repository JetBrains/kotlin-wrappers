package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

val convertTestQualifiedName = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        nullable {
            ensure(isQualifiedName(node))

            val left = node.left
            ensure(isIdentifier(left))
            ensure(left.text == "EventData")

            "node.test.eventData.${render(node.right)}"
        } ?: nullable {
            ensure(isQualifiedName(node))

            val left = node.left
            ensure(isIdentifier(left))
            ensure(left.text == "globalThis")

            ensure(node.right.text == "Error")

            "js.errors.JsError"
        } ?: nullable {
            ensure(isPropertyAccessExpression(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text == "globalThis")

            val name = node.name
            ensure(isIdentifier(name))
            ensure(name.text == "Error")

            "js.errors.JsError"
        }
    }
}
