// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxAttributes(node: Node): Boolean /* node is JsxAttributes */ {
    contract {
        returns(true) implies (node is JsxAttributes)
    }

    return isJsxAttributesRaw(node)
}
