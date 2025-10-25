// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxOpeningFragment(node: Node): Boolean /* node is JsxOpeningFragment */ {
    contract {
        returns(true) implies (node is JsxOpeningFragment)
    }

    return isJsxOpeningFragmentRaw(node)
}
