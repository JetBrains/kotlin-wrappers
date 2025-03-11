@file:Suppress("UNCHECKED_CAST")

package wrappers.example.table.selection

import js.objects.PropertyKey
import js.symbol.Symbol
import preact.signals.core.Signal
import preact.signals.react.useSignal
import tanstack.table.core.TableMeta

internal typealias SelectedKeys = Set<String>
internal typealias Selection = Signal<SelectedKeys>

private val EMPTY_SELECTION: SelectedKeys = emptySet()
private val SELECTION = Symbol("selection")

internal fun useTableSelection(): Pair<PropertyKey, Selection> {
    val selection = useSignal(EMPTY_SELECTION)

    return SELECTION to selection
}

internal val TableMeta.selection: Selection
    get() = get(SELECTION) as Selection
