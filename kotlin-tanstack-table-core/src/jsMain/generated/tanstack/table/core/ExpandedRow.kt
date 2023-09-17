// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedRow {
    var toggleExpanded: (expanded: Boolean?) -> Unit
    var getIsExpanded: () -> Boolean
    var getCanExpand: () -> Boolean
    var getIsAllParentsExpanded: () -> Boolean
    var getToggleExpandedHandler: () -> () -> Unit
}
