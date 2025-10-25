// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocNonNullableType(node: Node): Boolean /* node is JSDocNonNullableType */ {
    contract {
        returns(true) implies (node is JSDocNonNullableType)
    }

    return isJSDocNonNullableTypeRaw(node)
}
