package tanstack.react.table

import js.objects.Object
import js.objects.recordOf
import react.useMemo
import tanstack.table.core.TableMeta

fun useTableMeta(
    vararg values: TableMeta,
): TableMeta =
    useMemo(values) {
        Object.assign(
            dest = recordOf(),
            src = values,
        )
    }
