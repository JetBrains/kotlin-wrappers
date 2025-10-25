// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCaseBlock(node: Node): Boolean /* node is CaseBlock */ {
    contract {
        returns(true) implies (node is CaseBlock)
    }

    return isCaseBlockRaw(node)
}
