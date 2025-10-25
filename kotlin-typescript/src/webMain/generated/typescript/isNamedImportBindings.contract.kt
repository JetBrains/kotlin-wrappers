// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamedImportBindings(node: Node): Boolean /* node is NamedImportBindings */ {
    contract {
        returns(true) implies (node is NamedImportBindings)
    }

    return isNamedImportBindingsRaw(node)
}
