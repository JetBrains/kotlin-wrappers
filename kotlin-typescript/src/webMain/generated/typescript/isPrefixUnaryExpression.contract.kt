// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPrefixUnaryExpression(node: Node): Boolean /* node is PrefixUnaryExpression */ {
    contract {
        returns(true) implies (node is PrefixUnaryExpression)
    }

    return isPrefixUnaryExpressionRaw(node)
}
