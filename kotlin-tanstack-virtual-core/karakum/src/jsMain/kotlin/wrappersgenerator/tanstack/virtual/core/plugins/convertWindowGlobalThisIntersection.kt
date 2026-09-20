package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `Window & typeof globalThis`
val convertWindowGlobalThisIntersection = createPlugin { node, _, _ ->
    nullable {
        ensure(isIntersectionTypeNode(node))

        val types = node.types.asArray()
        ensure(types.size == 2)

        val windowReference = ensureNotNull(types.singleOrNull(::isTypeReferenceNode))
        ensure(isTypeReferenceNode(windowReference))

        val typeName = windowReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Window")

        ensureNotNull(types.singleOrNull { it.kind == SyntaxKind.TypeQuery })

        "web.window.Window"
    }
}
