// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocTypeTag(node: Node): Boolean /* node is JSDocTypeTag */ {
    contract {
        returns(true) implies (node is JSDocTypeTag)
    }

    return isJSDocTypeTagRaw(node)
}
