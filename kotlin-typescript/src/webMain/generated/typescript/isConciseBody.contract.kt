// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isConciseBody(node: Node): Boolean /* node is ConciseBody */ {
    contract {
        returns(true) implies (node is ConciseBody)
    }

    return isConciseBodyRaw(node)
}
