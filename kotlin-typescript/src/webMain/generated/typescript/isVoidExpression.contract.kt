// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isVoidExpression(node: Node): Boolean /* node is VoidExpression */ {
    contract {
        returns(true) implies (node is VoidExpression)
    }

    return isVoidExpressionRaw(node)
}
