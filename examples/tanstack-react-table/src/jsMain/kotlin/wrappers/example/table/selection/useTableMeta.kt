package wrappers.example.table.selection

import preact.signals.react.useSignal
import react.use.useConstant
import tanstack.table.core.TableMeta

internal fun useTableMeta(): TableMeta {
    val selection = useSignal(EMPTY_SELECTION)

    return useConstant {
        createMeta(selection)
    }
}
