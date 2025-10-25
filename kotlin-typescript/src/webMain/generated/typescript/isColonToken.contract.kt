// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isColonToken(node: Node): Boolean /* node is ColonToken */ {
    contract {
        returns(true) implies (node is ColonToken)
    }

    return isColonTokenRaw(node)
}
