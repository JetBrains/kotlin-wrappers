// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isNonNullExpression(node: Node): Boolean /* node is NonNullExpression */ {
    contract {
        returns(true) implies (node is NonNullExpression)
    }

    return isNonNullExpressionRaw(node)
}
