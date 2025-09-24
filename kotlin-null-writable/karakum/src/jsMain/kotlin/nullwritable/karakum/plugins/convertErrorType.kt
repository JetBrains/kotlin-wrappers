package nullwritable.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertErrorType = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Error")

        "js.errors.JsError"
    }
}
