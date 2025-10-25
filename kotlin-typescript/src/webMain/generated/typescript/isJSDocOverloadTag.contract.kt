// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocOverloadTag(node: Node): Boolean /* node is JSDocOverloadTag */ {
    contract {
        returns(true) implies (node is JSDocOverloadTag)
    }

    return isJSDocOverloadTagRaw(node)
}
