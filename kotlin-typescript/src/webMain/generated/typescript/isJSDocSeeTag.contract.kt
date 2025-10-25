// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocSeeTag(node: Node): Boolean /* node is JSDocSeeTag */ {
    contract {
        returns(true) implies (node is JSDocSeeTag)
    }

    return isJSDocSeeTagRaw(node)
}
