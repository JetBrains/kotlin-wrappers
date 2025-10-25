// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isParenthesizedExpression(node: Node): Boolean /* node is ParenthesizedExpression */ {
    contract {
        returns(true) implies (node is ParenthesizedExpression)
    }

    return isParenthesizedExpressionRaw(node)
}
