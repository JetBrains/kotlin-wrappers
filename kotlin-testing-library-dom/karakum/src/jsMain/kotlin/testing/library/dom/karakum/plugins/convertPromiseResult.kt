package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.Node
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "Promise")
} != null

val convertPromiseResult = createPlugin { node, _, render ->
    nullable {
        ensure(isUnionTypeNode(node))
        ensure(node.types.asArray().size == 2)
        ensure(node.types.asArray().any { isPromiseType(it) })

        val promiseType = node.types.asArray().first { isPromiseType(it) }
        val otherType = node.types.asArray().first { !isPromiseType(it) }

        ensure(isTypeReferenceNode(promiseType))

        val typeArguments = ensureNotNull(promiseType.typeArguments)

        val promisePayload = render(typeArguments.asArray().first())
        val otherPayload = render(otherType)

        ensure(promisePayload == otherPayload)

        "js.promise.PromiseResult<${promisePayload}>"
    }
}
