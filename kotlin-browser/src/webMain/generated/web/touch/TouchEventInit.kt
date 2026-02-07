// Automatically generated - do not modify!

package web.touch

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.uievents.EventModifierInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/TouchEvent#options)
 */
@JsPlainObject
external interface TouchEventInit :
    EventModifierInit {
    var changedTouches: ReadonlyArray<Touch>?
    var targetTouches: ReadonlyArray<Touch>?
    var touches: ReadonlyArray<Touch>?
}
