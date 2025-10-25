// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isEqualsGreaterThanToken(node: Node): Boolean /* node is EqualsGreaterThanToken */ {
    contract {
        returns(true) implies (node is EqualsGreaterThanToken)
    }

    return isEqualsGreaterThanTokenRaw(node)
}
