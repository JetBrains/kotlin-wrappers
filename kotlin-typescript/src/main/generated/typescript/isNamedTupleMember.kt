// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isNamedTupleMember(node: Node): Boolean {
    contract {
        returns(true) implies (node is NamedTupleMember)
    }

    return typescript.raw.isNamedTupleMember(node)
}
