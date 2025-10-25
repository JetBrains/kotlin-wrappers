// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPrivateIdentifier(node: Node): Boolean /* node is PrivateIdentifier */ {
    contract {
        returns(true) implies (node is PrivateIdentifier)
    }

    return isPrivateIdentifierRaw(node)
}
