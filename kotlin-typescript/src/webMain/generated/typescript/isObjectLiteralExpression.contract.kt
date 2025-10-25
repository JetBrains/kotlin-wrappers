// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isObjectLiteralExpression(node: Node): Boolean /* node is ObjectLiteralExpression */ {
    contract {
        returns(true) implies (node is ObjectLiteralExpression)
    }

    return isObjectLiteralExpressionRaw(node)
}
