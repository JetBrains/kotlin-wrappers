// Automatically generated - do not modify!

package web.mouse

import js.objects.JsPlainObject
import web.events.EventTarget
import web.uievents.EventModifierInit

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/MouseEvent#options)
 */
@JsPlainObject
external interface MouseEventInit :
    EventModifierInit {
    var button: MouseButton?
    var buttons: MouseButtons?
    var clientX: Int?
    var clientY: Int?
    var movementX: Double?
    var movementY: Double?
    var relatedTarget: EventTarget?
    var screenX: Int?
    var screenY: Int?
}
