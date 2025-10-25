// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBinaryExpression(node: Node): Boolean /* node is BinaryExpression */ {
    contract {
        returns(true) implies (node is BinaryExpression)
    }

    return isBinaryExpressionRaw(node)
}
