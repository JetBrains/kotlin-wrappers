// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isElementAccessExpression(node: Node): Boolean /* node is ElementAccessExpression */ {
    contract {
        returns(true) implies (node is ElementAccessExpression)
    }

    return isElementAccessExpressionRaw(node)
}
