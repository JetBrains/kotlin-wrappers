// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocNamepathType(node: Node): Boolean /* node is JSDocNamepathType */ {
    contract {
        returns(true) implies (node is JSDocNamepathType)
    }

    return isJSDocNamepathTypeRaw(node)
}
