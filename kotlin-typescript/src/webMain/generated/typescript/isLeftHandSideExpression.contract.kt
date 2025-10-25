// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isLeftHandSideExpression(node: Node): Boolean /* node is LeftHandSideExpression */ {
    contract {
        returns(true) implies (node is LeftHandSideExpression)
    }

    return isLeftHandSideExpressionRaw(node)
}
