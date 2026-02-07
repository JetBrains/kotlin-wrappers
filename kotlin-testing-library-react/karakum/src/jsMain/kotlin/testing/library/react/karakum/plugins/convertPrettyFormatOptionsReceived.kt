package testing.library.react.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

val convertPrettyFormatOptionsReceived = createPlugin { node, context, _ ->
    val typeScriptService = context.lookupService(typeScriptServiceKey)

    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isQualifiedName(typeName))
        ensure(typeName.right.text == "OptionsReceived")

        val left = typeName.left
        ensure(isIdentifier(left))
        ensure(left.text == "prettyFormat")

        "Any /* TODO: ${typeScriptService?.printNode(node)} */"
    }
}
