// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isModuleBlock(node: Node): Boolean /* node is ModuleBlock */ {
    contract {
        returns(true) implies (node is ModuleBlock)
    }

    return isModuleBlockRaw(node)
}
