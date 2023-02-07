// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isArrayTypeNode(node: Node): Boolean {
    contract {
        returns(true) implies (node is ArrayTypeNode)
    }

    return typescript.raw.isArrayTypeNode(node)
}
