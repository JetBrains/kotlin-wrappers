// Automatically generated - do not modify!

@file:JsModule("@mui/material/TableSortLabel")

package mui.material

import web.cssom.ClassName

sealed external interface TableSortLabelClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `direction="desc"`. */
    val directionDesc: ClassName

    /** Styles applied to the root element if `direction="asc"`. */
    val directionAsc: ClassName

    /** State class applied to the root element if `active={true}`. */
    val active: ClassName

    /** Styles applied to the icon component. */
    val icon: ClassName

    /** Styles applied to the icon component if `direction="desc"`.
     * @deprecated Combine the [.MuiTableSortLabel-icon](/material-ui/api/table-sort-label/#table-sort-label-classes-icon) and [.MuiTableSortLabel-directionDesc](/material-ui/api/table-sort-label/#table-sort-label-classes-direction-desc) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconDirectionDesc: ClassName

    /** Styles applied to the icon component if `direction="asc"`.
     * @deprecated Combine the [.MuiTableSortLabel-icon](/material-ui/api/table-sort-label/#table-sort-label-classes-icon) and [.MuiTableSortLabel-directionAsc](/material-ui/api/table-sort-label/#table-sort-label-classes-direction-asc) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconDirectionAsc: ClassName
}

external val tableSortLabelClasses: TableSortLabelClasses
