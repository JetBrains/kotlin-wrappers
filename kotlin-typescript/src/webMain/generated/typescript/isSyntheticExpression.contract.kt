// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSyntheticExpression(node: Node): Boolean /* node is SyntheticExpression */ {
    contract {
        returns(true) implies (node is SyntheticExpression)
    }

    return isSyntheticExpressionRaw(node)
}
