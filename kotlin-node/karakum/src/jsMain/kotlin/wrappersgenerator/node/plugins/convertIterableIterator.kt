package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertIterableIterator = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "IterableIterator")

        val typeReference = ensureNotNull(node.parent)
        ensure(isTypeReferenceNode(typeReference))
        ensure(typeReference.typeName === node)

        "js.iterable.JsIterator"
    } ?: nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "AsyncIterableIterator")

        val typeReference = ensureNotNull(node.parent)
        ensure(isTypeReferenceNode(typeReference))
        ensure(typeReference.typeName === node)

        "js.iterable.AsyncIterator"
    }
}
