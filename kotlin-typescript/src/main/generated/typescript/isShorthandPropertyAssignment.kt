// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isShorthandPropertyAssignment(node: Node): Boolean {
    contract {
        returns(true) implies (node is ShorthandPropertyAssignment)
    }

    return typescript.raw.isShorthandPropertyAssignment(node)
}
