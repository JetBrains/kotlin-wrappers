// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPostfixUnaryExpression(node: Node): Boolean /* node is PostfixUnaryExpression */ {
    contract {
        returns(true) implies (node is PostfixUnaryExpression)
    }

    return isPostfixUnaryExpressionRaw(node)
}
