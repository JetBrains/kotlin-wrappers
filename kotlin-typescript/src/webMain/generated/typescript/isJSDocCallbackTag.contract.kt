// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocCallbackTag(node: Node): Boolean /* node is JSDocCallbackTag */ {
    contract {
        returns(true) implies (node is JSDocCallbackTag)
    }

    return isJSDocCallbackTagRaw(node)
}
