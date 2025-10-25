// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isParameterPropertyDeclaration(
    node: Node,
    parent: Node,
): Boolean /* node is ParameterPropertyDeclaration */ {
    contract {
        returns(true) implies (node is ParameterPropertyDeclaration)
    }

    return isParameterPropertyDeclarationRaw(node, parent)
}
