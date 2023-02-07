// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isJSDocUnknownTag(node: Node): Boolean {
    contract {
        returns(true) implies (node is JSDocUnknownTag)
    }

    return typescript.raw.isJSDocUnknownTag(node)
}
