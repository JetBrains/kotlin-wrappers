// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isModuleExportName(node: Node): Boolean /* node is ModuleExportName */ {
    contract {
        returns(true) implies (node is ModuleExportName)
    }

    return isModuleExportNameRaw(node)
}
