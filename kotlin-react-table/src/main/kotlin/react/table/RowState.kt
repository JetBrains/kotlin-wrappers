@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinext.js.ReadonlyArray
import kotlinext.js.Record

external val useRowState: PluginHook<Any>

external interface UseRowStateOptions<D : Any> {
    var initialRowStateAccessor: (row: Row<D>) -> UseRowStateLocalState<D, *>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var getResetRowStateDeps: (instance: TableInstance<D>) -> ReadonlyArray<Any>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var autoResetRowState: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

}

external interface HasCellState<D : Any> {
    var cellState: UseRowStateLocalState<D, *>
}

external interface UseRowStateState<D : Any> {
    var rowState: Record<String, HasCellState<D>>
}

external interface UseRowStateInstanceProps<D : Any> {
    fun setRowState(
        rowPath: ReadonlyArray<String>,
        updater: UseRowUpdater<*>,
    )

    fun setCellState(
        rowPath: ReadonlyArray<String>,
        columnId: IdType<D>,
        updater: UseRowUpdater<*>,
    )
}

external interface UseRowStateRowProps<D : Any> {
    val state: UseRowStateLocalState<D, *>
    fun setState(updater: UseRowUpdater<*>)
}

external interface UseRowStateCellProps<D : Any> {
    val state: UseRowStateLocalState<D, *>
    fun setState(updater: UseRowUpdater<*>)
}

// TODO: support `T` alias
typealias UseRowUpdater<T> = (T) -> T

@Suppress("UNUSED_TYPEALIAS_PARAMETER")
typealias UseRowStateLocalState<D, T> = Record<IdType<D>, T>
