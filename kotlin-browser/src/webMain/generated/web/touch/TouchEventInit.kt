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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/TouchEvent#changedTouches)
     */
    var changedTouches: ReadonlyArray<Touch>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/TouchEvent#targetTouches)
     */
    var targetTouches: ReadonlyArray<Touch>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/TouchEvent#touches)
     */
    var touches: ReadonlyArray<Touch>?
}
