// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isGetAccessor(node: Node): Boolean /* node is GetAccessorDeclaration */ {
    contract {
        returns(true) implies (node is GetAccessorDeclaration)
    }

    return isGetAccessorRaw(node)
}
