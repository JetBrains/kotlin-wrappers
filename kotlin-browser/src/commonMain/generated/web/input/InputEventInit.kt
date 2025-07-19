// Automatically generated - do not modify!

package web.input

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.data.DataTransfer
import web.ranges.StaticRange
import web.uievents.UIEventInit

@JsPlainObject
external interface InputEventInit :
    UIEventInit {
    var data: String?
    var dataTransfer: DataTransfer?
    var inputType: String?
    var isComposing: Boolean?
    var targetRanges: ReadonlyArray<StaticRange>?
}
