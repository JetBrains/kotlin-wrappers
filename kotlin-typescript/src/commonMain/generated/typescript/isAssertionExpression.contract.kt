// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE", "CANNOT_CHECK_FOR_ERASED", "ERROR_IN_CONTRACT_DESCRIPTION")
inline fun isAssertionExpression(node: Node): Boolean /* node is AssertionExpression */ {
    contract {
        returns(true) implies (node is AssertionExpression)
    }

    return isAssertionExpressionRaw(node)
}
