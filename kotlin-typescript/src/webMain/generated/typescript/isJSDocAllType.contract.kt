// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocAllType(node: Node): Boolean /* node is JSDocAllType */ {
    contract {
        returns(true) implies (node is JSDocAllType)
    }

    return isJSDocAllTypeRaw(node)
}
