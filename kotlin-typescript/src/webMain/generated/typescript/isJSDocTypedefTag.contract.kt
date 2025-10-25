// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocTypedefTag(node: Node): Boolean /* node is JSDocTypedefTag */ {
    contract {
        returns(true) implies (node is JSDocTypedefTag)
    }

    return isJSDocTypedefTagRaw(node)
}
