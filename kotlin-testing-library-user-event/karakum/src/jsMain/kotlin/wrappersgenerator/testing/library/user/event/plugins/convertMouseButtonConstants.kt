package wrappersgenerator.testing.library.user.event.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isVariableDeclaration

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
