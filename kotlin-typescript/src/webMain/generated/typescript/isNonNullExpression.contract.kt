// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNonNullExpression(node: Node): Boolean /* node is NonNullExpression */ {
    contract {
        returns(true) implies (node is NonNullExpression)
    }

    return isNonNullExpressionRaw(node)
}
