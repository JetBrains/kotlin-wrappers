// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocTypeLiteral(node: Node): Boolean /* node is JSDocTypeLiteral */ {
    contract {
        returns(true) implies (node is JSDocTypeLiteral)
    }

    return isJSDocTypeLiteralRaw(node)
}
