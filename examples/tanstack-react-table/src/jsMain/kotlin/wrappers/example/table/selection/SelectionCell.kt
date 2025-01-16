package wrappers.example.table.selection

import react.FC
import react.PropsWithValue
import react.dom.events.ChangeEvent
import react.useCallback
import react.useMemo
import tanstack.table.core.Row
import web.html.HTMLInputElement

internal val SelectionCell: FC<PropsWithValue<Row<*>>> = FC { props ->
    val rowId = props.value.id

    val changeHandler = useCallback(rowId) { _: ChangeEvent<HTMLInputElement> ->
        if (selectedKeys.value.contains(rowId)) {
            selectedKeys.value = selectedKeys.value.filterNot { it in rowId }.toTypedArray()
        } else {
            selectedKeys.value += rowId
        }
    }


    val rowIdArray = useMemo(rowId) {
        arrayOf(rowId)
    }

    SelectionCheckbox {
        value = rowIdArray
        onChange = changeHandler
    }
}
