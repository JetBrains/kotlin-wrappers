package testing.library.react.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

val convertReactQualifiedName = createPlugin { node, _, render ->
    nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "React")

        "react.${render(node.right)}"
    } ?: nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "ReactDOMClient")

        "react.dom.client.${render(node.right)}"
    }
}
