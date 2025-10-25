// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPropertyAccessChain(node: Node): Boolean /* node is PropertyAccessChain */ {
    contract {
        returns(true) implies (node is PropertyAccessChain)
    }

    return isPropertyAccessChainRaw(node)
}
