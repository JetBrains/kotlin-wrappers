// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

/**
 * Node test that determines whether a node is a valid type node.
 * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
 * of a TypeNode.
 */
fun isTypeNode(node: Node): Boolean {
    contract {
        returns(true) implies (node is TypeNode)
    }

    return typescript.raw.isTypeNode(node)
}
