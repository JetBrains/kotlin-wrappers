// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamedExportBindings(node: Node): Boolean /* node is NamedExportBindings */ {
    contract {
        returns(true) implies (node is NamedExportBindings)
    }

    return isNamedExportBindingsRaw(node)
}
