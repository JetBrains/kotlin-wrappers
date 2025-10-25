// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxSelfClosingElement(node: Node): Boolean /* node is JsxSelfClosingElement */ {
    contract {
        returns(true) implies (node is JsxSelfClosingElement)
    }

    return isJsxSelfClosingElementRaw(node)
}
