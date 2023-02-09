@file:JsModule("@tanstack/react-table")

package tanstack.react.table

import tanstack.table.core.RowData
import tanstack.table.core.Table
import tanstack.table.core.TableOptions

external fun <TData : RowData> useReactTable(
    options: TableOptions<TData>,
): Table<TData>
