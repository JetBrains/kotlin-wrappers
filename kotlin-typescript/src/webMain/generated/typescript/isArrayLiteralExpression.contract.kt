// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayLiteralExpression(node: Node): Boolean /* node is ArrayLiteralExpression */ {
    contract {
        returns(true) implies (node is ArrayLiteralExpression)
    }

    return isArrayLiteralExpressionRaw(node)
}
