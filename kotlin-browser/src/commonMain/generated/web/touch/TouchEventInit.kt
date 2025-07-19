// Automatically generated - do not modify!

package web.touch

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.uievents.EventModifierInit

@JsPlainObject
external interface TouchEventInit :
    EventModifierInit {
    var changedTouches: ReadonlyArray<Touch>?
    var targetTouches: ReadonlyArray<Touch>?
    var touches: ReadonlyArray<Touch>?
}
