// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isLiteralExpression(node: Node): Boolean /* node is LiteralExpression */ {
    contract {
        returns(true) implies (node is LiteralExpression)
    }

    return isLiteralExpressionRaw(node)
}
