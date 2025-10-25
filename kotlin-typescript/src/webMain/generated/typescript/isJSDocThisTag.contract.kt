// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocThisTag(node: Node): Boolean /* node is JSDocThisTag */ {
    contract {
        returns(true) implies (node is JSDocThisTag)
    }

    return isJSDocThisTagRaw(node)
}
