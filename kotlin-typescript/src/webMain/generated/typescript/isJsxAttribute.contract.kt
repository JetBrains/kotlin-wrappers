// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxAttribute(node: Node): Boolean /* node is JsxAttribute */ {
    contract {
        returns(true) implies (node is JsxAttribute)
    }

    return isJsxAttributeRaw(node)
}
