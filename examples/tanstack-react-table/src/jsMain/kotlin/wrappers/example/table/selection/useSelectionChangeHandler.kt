package wrappers.example.table.selection

import react.dom.events.ChangeEvent
import react.useCallback
import web.html.HTMLInputElement

internal fun useSelectionChangeHandler(
    keys: SelectedKeys,
    metadata: TableMetadata,
): (ChangeEvent<HTMLInputElement>) -> Unit {
    val selectionHandler = useSelectionHandler(metadata)

    return useCallback(keys) { event ->
        selectionHandler(keys.associateWith { event.target.checked })
    }
}
