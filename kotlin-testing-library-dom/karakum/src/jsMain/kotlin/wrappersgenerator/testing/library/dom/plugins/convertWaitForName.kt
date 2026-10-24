package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isFunctionDeclaration
import typescript.isIdentifier

val convertWaitForName = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "waitFor")

        val function = ensureNotNull(node.parent)
        ensure(isFunctionDeclaration(function))
        ensure(function.name === node)

        "waitForAsync"
    }
}
