package testing.library.user.event.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isVariableDeclaration

val convertMouseButtonConstants = createPlugin { node, _, render ->
    nullable {
        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "MouseButton")

        val type = render(ensureNotNull(node.type))

        """
            @JsName("MouseButton")
            external val MouseButtonConstants: $type
        """.trimIndent()
    }
}
