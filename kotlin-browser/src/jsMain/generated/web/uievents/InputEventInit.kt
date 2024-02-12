// Automatically generated - do not modify!

package web.uievents

import js.array.ReadonlyArray
import web.data.DataTransfer
import web.ranges.StaticRange

external interface InputEventInit :
    UIEventInit {
    val data: String?
    val dataTransfer: DataTransfer?
    val inputType: String?
    val isComposing: Boolean?
    val targetRanges: ReadonlyArray<StaticRange>?
}
