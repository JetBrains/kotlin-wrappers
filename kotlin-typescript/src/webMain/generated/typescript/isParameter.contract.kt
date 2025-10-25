// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isParameter(node: Node): Boolean /* node is ParameterDeclaration */ {
    contract {
        returns(true) implies (node is ParameterDeclaration)
    }

    return isParameterRaw(node)
}
