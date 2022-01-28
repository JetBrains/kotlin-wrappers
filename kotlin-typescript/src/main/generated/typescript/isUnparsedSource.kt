// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isUnparsedSource(node: Node): Boolean {
    contract {
        returns(true) implies (node is UnparsedSource)
    }

    return typescript.raw.isUnparsedSource(node)
}
