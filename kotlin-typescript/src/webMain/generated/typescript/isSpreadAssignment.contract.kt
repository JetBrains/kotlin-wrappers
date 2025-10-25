// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSpreadAssignment(node: Node): Boolean /* node is SpreadAssignment */ {
    contract {
        returns(true) implies (node is SpreadAssignment)
    }

    return isSpreadAssignmentRaw(node)
}
