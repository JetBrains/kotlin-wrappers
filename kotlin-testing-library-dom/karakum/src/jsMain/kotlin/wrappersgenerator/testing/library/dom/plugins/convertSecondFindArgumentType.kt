package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIndexedAccessTypeNode
import typescript.ast.`is`.isOptionalTypeNode

val convertSecondFindArgumentType = createPlugin { node, _, _ ->
    nullable {
        ensure(isIndexedAccessTypeNode(node))

        val optionalType = ensureNotNull(node.parent)
        ensure(isOptionalTypeNode(optionalType))

        // to avoid double optionality
        "Any"
    }
}
