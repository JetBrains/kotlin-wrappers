// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPlusToken(node: Node): Boolean /* node is PlusToken */ {
    contract {
        returns(true) implies (node is PlusToken)
    }

    return isPlusTokenRaw(node)
}
