@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

@JsName("useSortBy")
external val useSortBy: PluginHook<Any>

external interface UseSortByColumnProps<D> {
    val canSort: Boolean
    fun toggleSortBy(descending: Boolean, multi: Boolean)
    fun getSortByToggleProps(propGetter: HeaderPropGetter<D> = definedExternally): TableSortByToggleProps
    fun getSortByToggleProps(props: TableSortByToggleProps): TableSortByToggleProps
    fun clearSortBy()
    val isSorted: Boolean
    val sortedIndex: Int
    val isSortedDesc: Boolean
}

external interface TableSortByToggleProps : TableHeaderProps
