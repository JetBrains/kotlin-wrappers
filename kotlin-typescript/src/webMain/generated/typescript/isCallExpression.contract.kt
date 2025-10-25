// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCallExpression(node: Node): Boolean /* node is CallExpression */ {
    contract {
        returns(true) implies (node is CallExpression)
    }

    return isCallExpressionRaw(node)
}
