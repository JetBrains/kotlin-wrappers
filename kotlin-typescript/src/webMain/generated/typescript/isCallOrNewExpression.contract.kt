// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCallOrNewExpression(node: Node): Boolean /* node is CallExpression | NewExpression */ {
    contract {
        returns(true) implies (node is IsCallOrNewExpressionResultPredicate)
    }

    return isCallOrNewExpressionRaw(node)
}
