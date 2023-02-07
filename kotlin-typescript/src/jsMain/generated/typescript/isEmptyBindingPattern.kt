// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isEmptyBindingPattern(node: BindingName): Boolean {
    contract {
        returns(true) implies (node is BindingPattern)
    }

    return typescript.raw.isEmptyBindingPattern(node)
}
