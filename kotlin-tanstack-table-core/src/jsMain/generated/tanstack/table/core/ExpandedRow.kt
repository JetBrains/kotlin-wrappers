// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedRow {
    var getCanExpand: () -> Boolean
    var getIsAllParentsExpanded: () -> Boolean
    var getIsExpanded: () -> Boolean
    var getToggleExpandedHandler: () -> () -> Unit
    var toggleExpanded: (expanded: Boolean?) -> Unit
}
