// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocFunctionType(node: Node): Boolean /* node is JSDocFunctionType */ {
    contract {
        returns(true) implies (node is JSDocFunctionType)
    }

    return isJSDocFunctionTypeRaw(node)
}
