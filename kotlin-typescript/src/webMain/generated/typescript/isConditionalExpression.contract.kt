// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isConditionalExpression(node: Node): Boolean /* node is ConditionalExpression */ {
    contract {
        returns(true) implies (node is ConditionalExpression)
    }

    return isConditionalExpressionRaw(node)
}
