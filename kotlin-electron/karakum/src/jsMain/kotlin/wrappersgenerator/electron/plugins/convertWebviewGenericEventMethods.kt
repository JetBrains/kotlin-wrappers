package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

val convertWebviewGenericEventMethods = createPlugin { node, _, _ ->
    nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(
            name.text == "addEventListener"
                    || name.text == "removeEventListener",
        )

        val firstParameter = ensureNotNull(node.parameters.firstOrNull())

        val firstParameterName = firstParameter.name
        ensure(isIdentifier(firstParameterName))
        ensure(firstParameterName.text == "type")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "WebviewTag")

        ""
    }
}
