// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAccessor(node: Node): Boolean /* node is AccessorDeclaration */ {
    contract {
        returns(true) implies (node is AccessorDeclaration)
    }

    return isAccessorRaw(node)
}
