// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION",
)

package typescript

import kotlin.contracts.contract

fun isEqualsGreaterThanToken(node: Node): Boolean {
    contract {
        returns(true) implies (node is EqualsGreaterThanToken)
    }

    return typescript.raw.isEqualsGreaterThanToken(node)
}
