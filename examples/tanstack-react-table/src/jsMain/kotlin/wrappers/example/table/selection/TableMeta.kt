@file:Suppress("UNCHECKED_CAST")

package wrappers.example.table.selection

import js.objects.recordOf
import js.symbol.Symbol
import tanstack.table.core.Table
import tanstack.table.core.TableMeta

private val SELECTION = Symbol("selection")

internal fun createMeta(
    selection: Selection,
): TableMeta =
    recordOf(
        SELECTION to selection,
    )

internal val Table<*>.selection: Selection
    get() {
        val meta = requireNotNull(options.meta)

        return meta[SELECTION] as Selection
    }
