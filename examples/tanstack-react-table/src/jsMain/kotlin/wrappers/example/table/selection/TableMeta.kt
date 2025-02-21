@file:Suppress("UNCHECKED_CAST")

package wrappers.example.table.selection

import js.objects.recordOf
import js.symbol.Symbol
import tanstack.table.core.Table
import tanstack.table.core.TableMeta

private val SELECTION_KEY = Symbol("selection")

internal fun createMeta(
    selection: Selection,
): TableMeta =
    recordOf(
        SELECTION_KEY to selection,
    )

internal fun Table<*>.selection(): Selection {
    val meta = options.meta
    requireNotNull(meta)

    val selection = meta[SELECTION_KEY] as? Selection
    requireNotNull(selection)

    return selection
}
