package wrappersgenerator.tanstack.react.virtual.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeReferenceNode
import typescript.ast.`is`.isUnionTypeNode

// `TScrollElement extends Element | Window`
val convertElementWindowUnion = createPlugin { node, _, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val names = node.types.mapTo(mutableSetOf()) { type ->
            ensure(isTypeReferenceNode(type))

            val typeName = type.typeName
            ensure(isIdentifier(typeName))
            typeName.text
        }

        ensure(names == setOf("Element", "Window"))

        "web.events.EventTarget /* Element | Window */"
    }
}
