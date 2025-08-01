// Automatically generated - do not modify!

package web.touch

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.uievents.EventModifierInit

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/TouchEvent#options)
 */
@JsPlainObject
external interface TouchEventInit :
    EventModifierInit {
    var changedTouches: ReadonlyArray<Touch>?
    var targetTouches: ReadonlyArray<Touch>?
    var touches: ReadonlyArray<Touch>?
}
