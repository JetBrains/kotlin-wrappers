// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isStringLiteralOrJsxExpression(node: Node): Boolean /* node is StringLiteral | JsxExpression */ {
    contract {
        returns(true) implies (node is IsStringLiteralOrJsxExpressionResultPredicate)
    }

    return isStringLiteralOrJsxExpressionRaw(node)
}
