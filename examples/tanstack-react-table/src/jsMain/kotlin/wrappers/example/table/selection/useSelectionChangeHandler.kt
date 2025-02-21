package wrappers.example.table.selection

import react.dom.events.ChangeEvent
import react.useCallback
import web.html.HTMLInputElement

internal fun useSelectionChangeHandler(
    keys: SelectedKeys,
    selection: Selection,
): (ChangeEvent<HTMLInputElement>) -> Unit {
    val selectionHandler = useSelectionHandler(selection)

    return useCallback(keys) { event ->
        selectionHandler(keys.associateWith { event.target.checked })
    }
}
