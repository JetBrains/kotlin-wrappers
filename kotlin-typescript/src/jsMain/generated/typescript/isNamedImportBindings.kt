// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isNamedImportBindings(node: Node): Boolean {
    contract {
        returns(true) implies (node is NamedImportBindings)
    }

    return typescript.raw.isNamedImportBindings(node)
}
