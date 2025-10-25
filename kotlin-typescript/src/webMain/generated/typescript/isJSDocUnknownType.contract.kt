// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocUnknownType(node: Node): Boolean /* node is JSDocUnknownType */ {
    contract {
        returns(true) implies (node is JSDocUnknownType)
    }

    return isJSDocUnknownTypeRaw(node)
}
