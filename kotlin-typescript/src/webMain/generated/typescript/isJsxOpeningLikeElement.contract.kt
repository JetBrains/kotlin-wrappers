// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxOpeningLikeElement(node: Node): Boolean /* node is JsxOpeningLikeElement */ {
    contract {
        returns(true) implies (node is JsxOpeningLikeElement)
    }

    return isJsxOpeningLikeElementRaw(node)
}
