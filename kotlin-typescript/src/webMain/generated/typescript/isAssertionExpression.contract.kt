// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAssertionExpression(node: Node): Boolean /* node is AssertionExpression */ {
    contract {
        returns(true) implies (node is AssertionExpression)
    }

    return isAssertionExpressionRaw(node)
}
