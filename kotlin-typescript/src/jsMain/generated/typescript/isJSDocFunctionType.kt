// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isJSDocFunctionType(node: Node): Boolean {
    contract {
        returns(true) implies (node is JSDocFunctionType)
    }

    return typescript.raw.isJSDocFunctionType(node)
}
