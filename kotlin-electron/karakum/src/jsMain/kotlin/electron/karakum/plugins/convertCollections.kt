package electron.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isArrayTypeNode
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertCollections = createPlugin { node, _, render ->
    nullable {
        ensure(isArrayTypeNode(node))

        "js.array.ReadonlyArray<${render(node.elementType)}>"
    } ?: nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "Record")

        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))

        "js.objects.ReadonlyRecord"
    }
}
