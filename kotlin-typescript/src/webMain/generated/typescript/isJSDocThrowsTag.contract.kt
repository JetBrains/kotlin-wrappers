// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocThrowsTag(node: Node): Boolean /* node is JSDocThrowsTag */ {
    contract {
        returns(true) implies (node is JSDocThrowsTag)
    }

    return isJSDocThrowsTagRaw(node)
}
