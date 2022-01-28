// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "USELESS_IS_CHECK",
)

package typescript

import kotlin.contracts.contract

fun isEntityName(node: Node): Boolean {
    contract {
        returns(true) implies (node is EntityName)
    }

    return typescript.raw.isEntityName(node)
}
