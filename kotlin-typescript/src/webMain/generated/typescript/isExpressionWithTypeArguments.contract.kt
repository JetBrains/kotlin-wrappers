// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExpressionWithTypeArguments(node: Node): Boolean /* node is ExpressionWithTypeArguments */ {
    contract {
        returns(true) implies (node is ExpressionWithTypeArguments)
    }

    return isExpressionWithTypeArgumentsRaw(node)
}
