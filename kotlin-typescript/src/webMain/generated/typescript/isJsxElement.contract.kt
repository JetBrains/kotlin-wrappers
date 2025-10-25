// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxElement(node: Node): Boolean /* node is JsxElement */ {
    contract {
        returns(true) implies (node is JsxElement)
    }

    return isJsxElementRaw(node)
}
