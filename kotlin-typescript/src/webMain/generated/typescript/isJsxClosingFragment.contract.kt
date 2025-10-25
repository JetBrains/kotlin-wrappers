// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxClosingFragment(node: Node): Boolean /* node is JsxClosingFragment */ {
    contract {
        returns(true) implies (node is JsxClosingFragment)
    }

    return isJsxClosingFragmentRaw(node)
}
