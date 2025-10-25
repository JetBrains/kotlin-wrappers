// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportAttributeName(node: Node): Boolean /* node is ImportAttributeName */ {
    contract {
        returns(true) implies (node is ImportAttributeName)
    }

    return isImportAttributeNameRaw(node)
}
