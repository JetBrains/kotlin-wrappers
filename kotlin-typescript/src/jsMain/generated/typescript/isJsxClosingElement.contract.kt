// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isJsxClosingElement(node: Node): Boolean /* node is JsxClosingElement */ {
    contract {
        returns(true) implies (node is JsxClosingElement)
    }

    return isJsxClosingElementRaw(node)
}
