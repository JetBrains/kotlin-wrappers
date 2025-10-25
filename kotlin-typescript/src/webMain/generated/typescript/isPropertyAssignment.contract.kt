// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPropertyAssignment(node: Node): Boolean /* node is PropertyAssignment */ {
    contract {
        returns(true) implies (node is PropertyAssignment)
    }

    return isPropertyAssignmentRaw(node)
}
