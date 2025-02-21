package wrappers.example.table.selection

import react.use.useConstant
import wrappers.example.entities.Key

typealias SelectionHandler = (Map<Key, Boolean>) -> Unit

internal fun useSelectionHandler(
    selection: Selection,
): SelectionHandler =
    useConstant {
        createSelectionHandler(selection)
    }

private fun createSelectionHandler(
    selection: Selection,
): SelectionHandler = { keys ->
    val (add, remove) = keys.entries
        .partition { it.value }

    selection.value = selection.value - remove.toSelectedKeys() + add.toSelectedKeys()
}

private fun List<Map.Entry<Key, Boolean>>.toSelectedKeys(): SelectedKeys =
    map { it.key }.toSet()
