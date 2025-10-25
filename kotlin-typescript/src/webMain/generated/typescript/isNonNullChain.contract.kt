// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNonNullChain(node: Node): Boolean /* node is NonNullChain */ {
    contract {
        returns(true) implies (node is NonNullChain)
    }

    return isNonNullChainRaw(node)
}
