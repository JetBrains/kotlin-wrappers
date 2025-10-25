// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxExpression(node: Node): Boolean /* node is JsxExpression */ {
    contract {
        returns(true) implies (node is JsxExpression)
    }

    return isJsxExpressionRaw(node)
}
