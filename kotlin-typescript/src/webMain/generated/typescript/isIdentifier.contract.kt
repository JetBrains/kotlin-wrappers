// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isIdentifier(node: Node): Boolean /* node is Identifier */ {
    contract {
        returns(true) implies (node is Identifier)
    }

    return isIdentifierRaw(node)
}
