package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertIterableIterator = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "IterableIterator")

        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))
        ensure(typeReference.typeName === node)

        "js.iterable.JsIterator"
    } ?: nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "AsyncIterableIterator")

        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))
        ensure(typeReference.typeName === node)

        "js.iterable.AsyncIterator"
    }
}
