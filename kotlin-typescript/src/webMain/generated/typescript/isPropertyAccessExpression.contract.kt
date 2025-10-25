// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPropertyAccessExpression(node: Node): Boolean /* node is PropertyAccessExpression */ {
    contract {
        returns(true) implies (node is PropertyAccessExpression)
    }

    return isPropertyAccessExpressionRaw(node)
}
