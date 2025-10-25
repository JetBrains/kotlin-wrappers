// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocPropertyTag(node: Node): Boolean /* node is JSDocPropertyTag */ {
    contract {
        returns(true) implies (node is JSDocPropertyTag)
    }

    return isJSDocPropertyTagRaw(node)
}
