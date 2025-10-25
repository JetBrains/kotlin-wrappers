// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isShorthandPropertyAssignment(node: Node): Boolean /* node is ShorthandPropertyAssignment */ {
    contract {
        returns(true) implies (node is ShorthandPropertyAssignment)
    }

    return isShorthandPropertyAssignmentRaw(node)
}
