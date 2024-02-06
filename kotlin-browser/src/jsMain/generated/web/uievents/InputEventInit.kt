// Automatically generated - do not modify!

package web.uievents

import js.array.ReadonlyArray
import web.data.DataTransfer
import web.ranges.StaticRange

external interface InputEventInit : UIEventInit {
    var data: String?
    var dataTransfer: DataTransfer?
    var inputType: String?
    var isComposing: Boolean?
    var targetRanges: ReadonlyArray<StaticRange>?
}
