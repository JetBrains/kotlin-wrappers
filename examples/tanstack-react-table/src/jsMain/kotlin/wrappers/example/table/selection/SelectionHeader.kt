package wrappers.example.table.selection

import react.FC
import react.PropsWithValue
import react.dom.events.ChangeEvent
import react.useCallback
import web.html.HTMLInputElement

internal val SelectionHeader: FC<PropsWithValue<SelectedKeys>> = FC { props ->
    val rowIds = props.value

    val changeHandler = useCallback(rowIds) { _: ChangeEvent<HTMLInputElement> ->
        if (selectedKeys.value.size == rowIds.size) {
            selectedKeys.value = emptyArray()
        } else {
            selectedKeys.value = rowIds
        }
    }

    SelectionCheckbox {
        value = rowIds
        onChange = changeHandler
    }
}
