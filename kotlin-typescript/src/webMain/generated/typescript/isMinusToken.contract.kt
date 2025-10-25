// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMinusToken(node: Node): Boolean /* node is MinusToken */ {
    contract {
        returns(true) implies (node is MinusToken)
    }

    return isMinusTokenRaw(node)
}
