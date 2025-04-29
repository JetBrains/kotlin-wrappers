package example.components.table.styling

import js.core.JsAny
import js.objects.PropertyKey
import js.symbol.Symbol
import tanstack.table.core.TableMeta
import web.cssom.ClassName

internal typealias RowClassName<TData> = (row: TData, index: Int) -> ClassName?

private val GET_ROW_CLASSNAME = Symbol("row-classname")

internal fun <T> useRowClassName(
    value: RowClassName<T>,
): Pair<PropertyKey, RowClassName<T>> =
    GET_ROW_CLASSNAME to value

@Suppress("UNCHECKED_CAST")
internal val TableMeta.rowClassName: RowClassName<JsAny>
    get() = get(GET_ROW_CLASSNAME) as RowClassName<JsAny>
