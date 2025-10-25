// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExpression(node: Node): Boolean /* node is Expression */ {
    contract {
        returns(true) implies (node is Expression)
    }

    return isExpressionRaw(node)
}
