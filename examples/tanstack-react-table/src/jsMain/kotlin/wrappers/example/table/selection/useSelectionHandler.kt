package wrappers.example.table.selection

import preact.signals.core.Signal
import react.RequiredContext
import react.createRequiredContext
import react.useRequired
import wrappers.example.entities.Key

typealias SelectionHandler = (Map<Key, Boolean>) -> Unit

internal val SelectionHandlerContext: RequiredContext<SelectionHandler> =
    createRequiredContext()

internal fun useSelectionHandler(): SelectionHandler =
    useRequired(SelectionHandlerContext)

internal fun SelectionHandler(
    selection: Signal<SelectedKeys>,
): SelectionHandler = { keys ->
    val (add, remove) = keys.entries
        .partition { it.value }

    selection.value = selection.value - remove.toSelectedKeys() + add.toSelectedKeys()
}

private fun List<Map.Entry<Key, Boolean>>.toSelectedKeys(): SelectedKeys =
    map { it.key }.toSet()
