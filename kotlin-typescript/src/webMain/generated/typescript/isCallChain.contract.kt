// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCallChain(node: Node): Boolean /* node is CallChain */ {
    contract {
        returns(true) implies (node is CallChain)
    }

    return isCallChainRaw(node)
}
