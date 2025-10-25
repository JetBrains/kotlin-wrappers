// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocNullableType(node: Node): Boolean /* node is JSDocNullableType */ {
    contract {
        returns(true) implies (node is JSDocNullableType)
    }

    return isJSDocNullableTypeRaw(node)
}
