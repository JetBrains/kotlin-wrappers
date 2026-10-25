package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isInterfaceDeclaration

val convertNodeArray = createPlugin { node, _, render ->
    nullable {
        ensure(isInterfaceDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "NodeArray")

        sequenceOf(
            render(node)
                .replaceFirst(" NodeArray<", " MutableNodeArray<"),
            "typealias NodeArray<T> = MutableNodeArray<out T>",
        ).joinToString("\n\n")
    }
}
