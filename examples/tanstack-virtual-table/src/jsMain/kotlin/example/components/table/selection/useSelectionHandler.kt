package example.components.table.selection

import example.entities.Key
import react.use.useConstant

typealias SelectionHandler = (Map<Key, Boolean>) -> Unit

internal fun useSelectionHandler(): SelectionHandler {
    val selection = useSelection()

    return useConstant {
        createSelectionHandler(selection)
    }
}

private fun createSelectionHandler(
    selection: Selection,
): SelectionHandler = { keys ->
    val (add, remove) = keys.entries
        .partition { it.value }
        .let { Pair(it.first.toSelectedKeys(), it.second.toSelectedKeys()) }

    selection.value = selection.value - remove + add
}

private fun List<Map.Entry<Key, Boolean>>.toSelectedKeys(): SelectedKeys =
    map { it.key }.toSet()
