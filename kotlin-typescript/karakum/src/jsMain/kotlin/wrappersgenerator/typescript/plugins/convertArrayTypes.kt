package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isInterfaceDeclaration

val convertArrayTypes = createPlugin { node, _, render ->
    nullable {
        ensure(isInterfaceDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))

        val newBody = when (name.text) {
            "NodeArray" -> "typealias NodeArray<T /* Node */> = js.array.ReadonlyArray<T>"
            "SortedArray" -> "typealias SortedArray<T> = js.array.JsArray<T>"
            "SortedReadonlyArray" -> "typealias SortedReadonlyArray<T> = js.array.ReadonlyArray<T>"
            else -> null
        }

        ensureNotNull(newBody)

        val originalBody = render(node)

        "/*\n$originalBody\n*/\n\n$newBody"
    }
}
