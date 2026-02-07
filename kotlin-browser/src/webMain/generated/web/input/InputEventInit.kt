// Automatically generated - do not modify!

package web.input

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.data.DataTransfer
import web.ranges.StaticRange
import web.uievents.UIEventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent#options)
 */
@JsPlainObject
external interface InputEventInit :
    UIEventInit {
    var data: String?
    var dataTransfer: DataTransfer?
    var inputType: String?
    var isComposing: Boolean?
    var targetRanges: ReadonlyArray<StaticRange>?
}
