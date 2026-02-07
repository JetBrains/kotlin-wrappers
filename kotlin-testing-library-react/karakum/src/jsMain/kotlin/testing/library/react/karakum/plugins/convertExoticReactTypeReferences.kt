package testing.library.react.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

val convertExoticReactTypeReferences = createPlugin { node, context, _ ->
    val typeScriptService = context.lookupService(typeScriptServiceKey)

    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isQualifiedName(typeName))
        ensure(typeName.right.text == "Container")

        val left = typeName.left
        ensure(isIdentifier(left))
        ensure(left.text == "ReactDOMClient")

        "Any /* ${typeScriptService?.printNode(node)} */"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isQualifiedName(typeName))
        ensure(typeName.right.text == "JSXElementConstructor")

        val left = typeName.left
        ensure(isIdentifier(left))
        ensure(left.text == "React")

        "Any /* ${typeScriptService?.printNode(node)} */"
    }
}
