package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isOptionalTypeNode

val convertOptionalType = createPlugin { node, _, render ->
    nullable {
        ensure(isOptionalTypeNode(node))

        val type = render(node.type)

        "${type}?"
    }
}
