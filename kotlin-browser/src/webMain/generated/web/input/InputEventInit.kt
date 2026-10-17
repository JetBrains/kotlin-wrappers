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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent#data)
     */
    var data: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent#dataTransfer)
     */
    var dataTransfer: DataTransfer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent#inputType)
     */
    var inputType: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent#isComposing)
     */
    var isComposing: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent#targetRanges)
     */
    var targetRanges: ReadonlyArray<StaticRange>?
}
