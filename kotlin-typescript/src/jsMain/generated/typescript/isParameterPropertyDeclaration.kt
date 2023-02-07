// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

fun isParameterPropertyDeclaration(
    node: Node,
    parent: Node,
): Boolean {
    contract {
        returns(true) implies (node is ParameterPropertyDeclaration)
    }

    return typescript.raw.isParameterPropertyDeclaration(node, parent)
}
