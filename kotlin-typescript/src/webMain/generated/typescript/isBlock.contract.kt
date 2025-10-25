// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBlock(node: Node): Boolean /* node is Block */ {
    contract {
        returns(true) implies (node is Block)
    }

    return isBlockRaw(node)
}
