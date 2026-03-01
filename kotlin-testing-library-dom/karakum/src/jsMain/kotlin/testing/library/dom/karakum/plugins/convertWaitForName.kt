package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isFunctionDeclaration
import typescript.isIdentifier

val convertWaitForName = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "waitFor")

        val function = ensureNotNull(node.getParentOrNull())
        ensure(isFunctionDeclaration(function))
        ensure(function.name === node)

        "waitForAsync"
    }
}
