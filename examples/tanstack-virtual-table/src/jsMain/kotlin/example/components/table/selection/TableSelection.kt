@file:Suppress("UNCHECKED_CAST")

package example.components.table.selection

import js.objects.recordOf
import js.symbol.Symbol
import preact.signals.core.Signal
import preact.signals.react.useSignal
import tanstack.table.core.TableMeta

internal typealias SelectedKeys = Set<String>
internal typealias Selection = Signal<SelectedKeys>

private val EMPTY_SELECTION: SelectedKeys = emptySet()
private val SELECTION = Symbol("selection")

internal fun useTableSelection(): TableMeta {
    val selection = useSignal(EMPTY_SELECTION)

    return recordOf(
        SELECTION to selection
    )
}

internal val TableMeta.selection: Selection
    get() = get(SELECTION) as Selection
