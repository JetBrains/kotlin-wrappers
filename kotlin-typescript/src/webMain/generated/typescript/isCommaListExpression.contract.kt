// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCommaListExpression(node: Node): Boolean /* node is CommaListExpression */ {
    contract {
        returns(true) implies (node is CommaListExpression)
    }

    return isCommaListExpressionRaw(node)
}
