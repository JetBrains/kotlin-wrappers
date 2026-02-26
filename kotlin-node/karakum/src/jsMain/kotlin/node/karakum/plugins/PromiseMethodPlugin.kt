package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseMethodPlugin
import typescript.Node
import typescript.isIdentifier
import typescript.isTypeReferenceNode

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

fun createPromiseMethodPlugin() = PromiseMethodPlugin(
    isPromiseType = { node, _ -> isPromiseType(node) },
)
