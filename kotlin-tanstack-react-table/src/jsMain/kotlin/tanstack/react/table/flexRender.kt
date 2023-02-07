@file:JsModule("@tanstack/react-table")
@file:JsNonModule

package tanstack.react.table

import react.ReactNode
import tanstack.table.core.ColumnDefTemplate
import tanstack.table.core.HeaderContext
import tanstack.table.core.RowData
import tanstack.table.core.StringOrTemplateHeader

external fun <TData : RowData, TValue> flexRender(
    Comp: StringOrTemplateHeader<TData, TValue>?,
    props: HeaderContext<TData, TValue>,
): ReactNode?

external fun <T : Any> flexRender(
    Comp: ColumnDefTemplate<out T>?,
    props: T
): ReactNode?
