package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

// `TScrollElement extends Element | Window`
val convertElementWindowUnion = createPlugin { node, _, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val names = node.types.asArray().map { type ->
            ensure(isTypeReferenceNode(type))

            val typeName = type.typeName
            ensure(isIdentifier(typeName))
            typeName.text
        }

        ensure(names == listOf("Element", "Window"))

        "web.events.EventTarget /* Element | Window */"
    }
}
