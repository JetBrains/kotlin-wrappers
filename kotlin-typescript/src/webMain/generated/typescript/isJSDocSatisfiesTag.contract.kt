// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocSatisfiesTag(node: Node): Boolean /* node is JSDocSatisfiesTag */ {
    contract {
        returns(true) implies (node is JSDocSatisfiesTag)
    }

    return isJSDocSatisfiesTagRaw(node)
}
