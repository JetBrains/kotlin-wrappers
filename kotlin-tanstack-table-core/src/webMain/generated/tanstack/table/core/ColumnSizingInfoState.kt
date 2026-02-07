// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import js.array.Tuple2
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ColumnSizingInfoState {
    val columnSizingStart: ReadonlyArray<Tuple2<String, Int>>
    val deltaOffset: Int?
    val deltaPercentage: Int?
    val isResizingColumn: String /* false | string */
    val startOffset: Int?
    val startSize: Int?
}
