// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isOmittedExpression(node: Node): Boolean /* node is OmittedExpression */ {
    contract {
        returns(true) implies (node is OmittedExpression)
    }

    return isOmittedExpressionRaw(node)
}
