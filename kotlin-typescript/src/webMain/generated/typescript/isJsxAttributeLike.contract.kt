// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxAttributeLike(node: Node): Boolean /* node is JsxAttributeLike */ {
    contract {
        returns(true) implies (node is JsxAttributeLike)
    }

    return isJsxAttributeLikeRaw(node)
}
