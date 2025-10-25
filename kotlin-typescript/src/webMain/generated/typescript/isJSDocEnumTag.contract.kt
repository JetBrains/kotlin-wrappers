// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocEnumTag(node: Node): Boolean /* node is JSDocEnumTag */ {
    contract {
        returns(true) implies (node is JSDocEnumTag)
    }

    return isJSDocEnumTagRaw(node)
}
