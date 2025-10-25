// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExclamationToken(node: Node): Boolean /* node is ExclamationToken */ {
    contract {
        returns(true) implies (node is ExclamationToken)
    }

    return isExclamationTokenRaw(node)
}
