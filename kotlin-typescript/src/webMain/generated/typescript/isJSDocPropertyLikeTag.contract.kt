// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocPropertyLikeTag(node: Node): Boolean /* node is JSDocPropertyLikeTag */ {
    contract {
        returns(true) implies (node is JSDocPropertyLikeTag)
    }

    return isJSDocPropertyLikeTagRaw(node)
}
