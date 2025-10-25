// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isClassExpression(node: Node): Boolean /* node is ClassExpression */ {
    contract {
        returns(true) implies (node is ClassExpression)
    }

    return isClassExpressionRaw(node)
}
