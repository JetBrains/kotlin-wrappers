@file:Suppress("UNCHECKED_CAST")

package wrappers.example.table.selection

import js.objects.recordOf
import js.symbol.Symbol
import tanstack.table.core.Table
import tanstack.table.core.TableMeta

private val SELECTION_KEY = Symbol("selection-key")

internal fun createMeta(
    selection: Selection,
): TableMeta =
    recordOf(
        SELECTION_KEY to selection,
    )

internal fun Table<*>.selection(): Selection {
    val selection = options.meta?.get(SELECTION_KEY) as? Selection

    return requireNotNull(selection)
}
