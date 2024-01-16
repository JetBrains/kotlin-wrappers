// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

/**
 * Determines whether a node is an expression based only on its kind.
 */
fun isExpression(node: Node): Boolean {
    contract {
        returns(true) implies (node is Expression)
    }

    return typescript.raw.isExpression(node)
}
