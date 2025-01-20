package wrappers.example.table.selection

import preact.signals.react.useSignal
import react.FC
import react.PropsWithChildren
import react.useCallback
import wrappers.example.entities.Key

internal val TableSelectionModule: FC<PropsWithChildren> = FC { props ->
    val selection = useSignal(EMPTY_SELECTION)

    val selectionHandler: SelectionHandler<Key> = useCallback { keys ->
        val (add, remove) = keys.entries
            .partition { it.value }

        selection.value = selection.value - remove.toSelectedKeys() + add.toSelectedKeys()
    }

    SelectedKeysContext(selection) {
        SelectionHandlerContext(selectionHandler) {
            +props.children
        }
    }
}

private fun List<Map.Entry<Key, Boolean>>.toSelectedKeys(): SelectedKeys =
    map { it.key }.toSet()
