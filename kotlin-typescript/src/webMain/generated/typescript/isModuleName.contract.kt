// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isModuleName(node: Node): Boolean /* node is ModuleName */ {
    contract {
        returns(true) implies (node is ModuleName)
    }

    return isModuleNameRaw(node)
}
