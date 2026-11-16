package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeReferenceNode

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
