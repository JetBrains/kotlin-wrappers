// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isObjectBindingPattern(node: Node): Boolean {
    contract {
        returns(true) implies (node is ObjectBindingPattern)
    }

    return typescript.raw.isObjectBindingPattern(node)
}
