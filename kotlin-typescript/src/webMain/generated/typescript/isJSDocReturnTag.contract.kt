// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocReturnTag(node: Node): Boolean /* node is JSDocReturnTag */ {
    contract {
        returns(true) implies (node is JSDocReturnTag)
    }

    return isJSDocReturnTagRaw(node)
}
