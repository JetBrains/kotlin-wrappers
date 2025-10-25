// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxOpeningElement(node: Node): Boolean /* node is JsxOpeningElement */ {
    contract {
        returns(true) implies (node is JsxOpeningElement)
    }

    return isJsxOpeningElementRaw(node)
}
