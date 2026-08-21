package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `Window & typeof globalThis`
val convertWindowGlobalThisIntersection = createPlugin { node, _, _ ->
    nullable {
        ensure(isIntersectionTypeNode(node))

        val types = node.types.asArray()
        ensure(types.size == 2)

        val windowReference = types.first()
        ensure(isTypeReferenceNode(windowReference))

        val typeName = windowReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Window")

        ensure(isTypeQueryNode(types.last()))

        "web.window.Window"
    }
}
