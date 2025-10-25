// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJsxText(node: Node): Boolean /* node is JsxText */ {
    contract {
        returns(true) implies (node is JsxText)
    }

    return isJsxTextRaw(node)
}
