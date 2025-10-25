// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFunctionExpression(node: Node): Boolean /* node is FunctionExpression */ {
    contract {
        returns(true) implies (node is FunctionExpression)
    }

    return isFunctionExpressionRaw(node)
}
