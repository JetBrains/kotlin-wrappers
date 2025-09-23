package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

private val modules = setOf(
    "dns",
    "net",
    "stream",
    "tty",
    "tls",
    "fs",
    "http",
    "path",
)

val convertModuleQualifiedName = createPlugin { node, _, render ->
    nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "url")

        ensure(node.right.text == "URL")

        "web.url.URL"
    } ?: nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "child")

        "node.childProcess.${render(node.right)}"
    } ?: nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isQualifiedName(left))

        val leftLeft = left.left
        ensure(isIdentifier(leftLeft))
        ensure(leftLeft.text in modules)

        ensure(left.right.text == "promises")

        "node.${leftLeft.text}.${render(node.right)}"
    } ?: nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text in modules)

        "node.${left.text}.${render(node.right)}"
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text in modules)

        "node.${expression.text}.${render(node.name)}"
    }
}
