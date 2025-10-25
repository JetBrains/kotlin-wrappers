// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStringLiteralOrJsxExpression(node: Node): Boolean /* node is StringLiteral | JsxExpression */ {
    contract {
        returns(true) implies (node is IsStringLiteralOrJsxExpressionResultPredicate)
    }

    return isStringLiteralOrJsxExpressionRaw(node)
}
