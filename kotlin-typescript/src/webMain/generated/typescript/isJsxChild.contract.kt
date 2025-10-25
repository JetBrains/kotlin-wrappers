// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxChild(node: Node): Boolean /* node is JsxChild */ {
    contract {
        returns(true) implies (node is JsxChild)
    }

    return isJsxChildRaw(node)
}
