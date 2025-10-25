// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCallLikeExpression(node: Node): Boolean /* node is CallLikeExpression */ {
    contract {
        returns(true) implies (node is CallLikeExpression)
    }

    return isCallLikeExpressionRaw(node)
}
