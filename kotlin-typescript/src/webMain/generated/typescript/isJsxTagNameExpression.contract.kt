// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxTagNameExpression(node: Node): Boolean /* node is JsxTagNameExpression */ {
    contract {
        returns(true) implies (node is JsxTagNameExpression)
    }

    return isJsxTagNameExpressionRaw(node)
}
