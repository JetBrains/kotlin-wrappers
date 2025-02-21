package wrappers.example.table.selection

import react.use.useConstant
import tanstack.table.core.TableMeta

internal fun useTableMeta(
    selection: Selection,
): TableMeta =
    useConstant {
        createMeta(selection)
    }
