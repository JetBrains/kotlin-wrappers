// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isEmptyStatement(node: Node): Boolean {
    contract {
        returns(true) implies (node is EmptyStatement)
    }

    return typescript.raw.isEmptyStatement(node)
}
