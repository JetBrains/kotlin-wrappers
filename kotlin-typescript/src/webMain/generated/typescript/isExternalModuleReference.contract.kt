// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExternalModuleReference(node: Node): Boolean /* node is ExternalModuleReference */ {
    contract {
        returns(true) implies (node is ExternalModuleReference)
    }

    return isExternalModuleReferenceRaw(node)
}
