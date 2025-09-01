package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.asArray
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
                    || name.text == "removeEventListener"
        )

        val firstParameter = ensureNotNull(node.parameters.asArray().firstOrNull())

        val firstParameterName = firstParameter.name
        ensure(isIdentifier(firstParameterName))
        ensure(firstParameterName.text == "type")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "WebviewTag")

        ""
    }
}
