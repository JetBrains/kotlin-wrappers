// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExportAssignment(node: Node): Boolean /* node is ExportAssignment */ {
    contract {
        returns(true) implies (node is ExportAssignment)
    }

    return isExportAssignmentRaw(node)
}
