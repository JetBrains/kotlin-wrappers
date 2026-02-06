package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIndexedAccessTypeNode
import typescript.isOptionalTypeNode

val convertSecondFindArgumentType = createPlugin { node, _, _ ->
    nullable {
        ensure(isIndexedAccessTypeNode(node))

        val optionalType = ensureNotNull(node.getParentOrNull())
        ensure(isOptionalTypeNode(optionalType))

        // to avoid double optionality
        "Any"
    }
}
