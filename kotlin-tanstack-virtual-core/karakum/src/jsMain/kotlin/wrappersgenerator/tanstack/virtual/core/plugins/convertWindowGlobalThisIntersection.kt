package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.SyntaxKind
import typescript.isIntersectionTypeNode
import typescript.isTypeReferenceNode

// `Window & typeof globalThis`
val convertWindowGlobalThisIntersection = createPlugin { node, _, render ->
    nullable {
        ensure(isIntersectionTypeNode(node))

        val types = node.types
        ensure(types.size == 2)

        val reference = ensureNotNull(types.singleOrNull { isTypeReferenceNode(it) })
        ensureNotNull(types.singleOrNull { it.kind == SyntaxKind.TypeQuery })

        render(reference)
    }
}
