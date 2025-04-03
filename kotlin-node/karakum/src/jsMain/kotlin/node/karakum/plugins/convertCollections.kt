package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isArrayTypeNode
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertCollections = createPlugin { node, _, render ->
    nullable {
        ensure(isArrayTypeNode(node))

        "js.array.ReadonlyArray<${render(node.elementType)}>"
    } ?: nullable {
        ensure(isIdentifier(node))
        ensure(isTypeReferenceNode(node.parent))
        ensure(node.text == "Record")

        "js.objects.ReadonlyRecord"
    } ?: nullable {
        ensure(isIdentifier(node))
        ensure(isTypeReferenceNode(node.parent))
        ensure(node.text == "Iterable")

        "js.iterable.JsIterable"
    }
}
