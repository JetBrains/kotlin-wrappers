// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSpreadElement(node: Node): Boolean /* node is SpreadElement */ {
    contract {
        returns(true) implies (node is SpreadElement)
    }

    return isSpreadElementRaw(node)
}
