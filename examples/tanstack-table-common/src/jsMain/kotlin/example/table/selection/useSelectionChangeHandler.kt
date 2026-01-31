package example.table.selection

import react.dom.events.ChangeEventHandler
import react.useCallback
import web.html.HTMLInputElement

internal fun useSelectionChangeHandler(
    keys: SelectedKeys,
): ChangeEventHandler<HTMLInputElement, HTMLInputElement> {
    val selectionHandler = useSelectionHandler()

    return useCallback(keys) { event ->
        selectionHandler(keys.associateWith { event.target.checked })
    }
}
