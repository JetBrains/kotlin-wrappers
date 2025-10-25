// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDeleteExpression(node: Node): Boolean /* node is DeleteExpression */ {
    contract {
        returns(true) implies (node is DeleteExpression)
    }

    return isDeleteExpressionRaw(node)
}
