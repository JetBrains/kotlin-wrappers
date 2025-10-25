// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxFragment(node: Node): Boolean /* node is JsxFragment */ {
    contract {
        returns(true) implies (node is JsxFragment)
    }

    return isJsxFragmentRaw(node)
}
