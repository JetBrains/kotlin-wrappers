// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isElementAccessChain(node: Node): Boolean /* node is ElementAccessChain */ {
    contract {
        returns(true) implies (node is ElementAccessChain)
    }

    return isElementAccessChainRaw(node)
}
