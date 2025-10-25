// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSemicolonClassElement(node: Node): Boolean /* node is SemicolonClassElement */ {
    contract {
        returns(true) implies (node is SemicolonClassElement)
    }

    return isSemicolonClassElementRaw(node)
}
