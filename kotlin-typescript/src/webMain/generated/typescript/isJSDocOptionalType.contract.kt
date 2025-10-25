// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocOptionalType(node: Node): Boolean /* node is JSDocOptionalType */ {
    contract {
        returns(true) implies (node is JSDocOptionalType)
    }

    return isJSDocOptionalTypeRaw(node)
}
