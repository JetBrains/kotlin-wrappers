// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocVariadicType(node: Node): Boolean /* node is JSDocVariadicType */ {
    contract {
        returns(true) implies (node is JSDocVariadicType)
    }

    return isJSDocVariadicTypeRaw(node)
}
