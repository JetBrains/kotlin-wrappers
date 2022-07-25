// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface HeadersInstance<TData : RowData> {
    var getHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getLeftHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getCenterHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getRightHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getLeftFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getCenterFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getRightFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>
    var getFlatHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getLeftFlatHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getCenterFlatHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getRightFlatHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getLeftLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getCenterLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
    var getRightLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
}
