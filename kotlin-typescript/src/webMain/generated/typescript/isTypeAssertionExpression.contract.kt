// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeAssertionExpression(node: Node): Boolean /* node is TypeAssertion */ {
    contract {
        returns(true) implies (node is TypeAssertion)
    }

    return isTypeAssertionExpressionRaw(node)
}
