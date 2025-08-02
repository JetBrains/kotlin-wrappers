package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

val convertWebCryptoQualifiedName = createPlugin { node, context, render ->
    nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "webcrypto")

        nullable {
            ensure(node.right.text == "BufferSource")

            "js.buffer.BufferSource"
        } ?: run {
            "web.crypto.${render(node.right)}"
        }
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "webcrypto")

        "web.crypto.${render(node.name)}"
    }
}
