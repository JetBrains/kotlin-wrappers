// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAsteriskToken(node: Node): Boolean /* node is AsteriskToken */ {
    contract {
        returns(true) implies (node is AsteriskToken)
    }

    return isAsteriskTokenRaw(node)
}
