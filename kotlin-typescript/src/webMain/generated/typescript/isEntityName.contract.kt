// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isEntityName(node: Node): Boolean /* node is EntityName */ {
    contract {
        returns(true) implies (node is EntityName)
    }

    return isEntityNameRaw(node)
}
