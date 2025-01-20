package wrappers.example.table.selection

import preact.signals.react.useSignal
import react.FC
import react.PropsWithChildren

internal val TableSelectionModule: FC<PropsWithChildren> = FC { props ->
    val selection = useSignal(EMPTY_SELECTION)
    val selectionHandler = SelectionHandler(selection)

    SelectedKeysContext(selection) {
        SelectionHandlerContext(selectionHandler) {
            +props.children
        }
    }
}
