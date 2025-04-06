// Automatically generated - do not modify!

package tanstack.table.core

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnSizingInfoState {
    val columnSizingStart: ReadonlyArray<JsTuple2<String, Int>>
    val deltaOffset: Int?
    val deltaPercentage: Int?
    val isResizingColumn: String /* false | string */
    val startOffset: Int?
    val startSize: Int?
}
