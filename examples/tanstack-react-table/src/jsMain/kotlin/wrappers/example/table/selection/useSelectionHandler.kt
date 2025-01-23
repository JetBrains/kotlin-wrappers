package wrappers.example.table.selection

import preact.signals.core.Signal
import react.use.useConstant
import wrappers.example.entities.Key

typealias SelectionHandler = (Map<Key, Boolean>) -> Unit

internal fun useSelectionHandler(
    metadata: TableMetadata,
): SelectionHandler =
    useConstant { createSelectionHandler(metadata.selection) }

private fun createSelectionHandler(
    selection: Signal<SelectedKeys>,
): SelectionHandler = { keys ->
    val (add, remove) = keys.entries
        .partition { it.value }

    selection.value = selection.value - remove.toSelectedKeys() + add.toSelectedKeys()
}

private fun List<Map.Entry<Key, Boolean>>.toSelectedKeys(): SelectedKeys =
    map { it.key }.toSet()
