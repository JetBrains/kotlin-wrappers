// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isModuleReference(node: Node): Boolean /* node is ModuleReference */ {
    contract {
        returns(true) implies (node is ModuleReference)
    }

    return isModuleReferenceRaw(node)
}
