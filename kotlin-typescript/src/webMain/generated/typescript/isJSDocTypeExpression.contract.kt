// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocTypeExpression(node: Node): Boolean /* node is JSDocTypeExpression */ {
    contract {
        returns(true) implies (node is JSDocTypeExpression)
    }

    return isJSDocTypeExpressionRaw(node)
}
