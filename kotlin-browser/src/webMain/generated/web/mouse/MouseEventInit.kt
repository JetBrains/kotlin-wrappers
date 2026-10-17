// Automatically generated - do not modify!

package web.mouse

import kotlinx.js.JsPlainObject
import web.events.EventTarget
import web.uievents.EventModifierInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#options)
 */
@JsPlainObject
external interface MouseEventInit :
    EventModifierInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#button)
     */
    var button: MouseButton?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#buttons)
     */
    var buttons: MouseButtons?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#clientX)
     */
    var clientX: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#clientY)
     */
    var clientY: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#movementX)
     */
    var movementX: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#movementY)
     */
    var movementY: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#relatedTarget)
     */
    var relatedTarget: EventTarget?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#screenX)
     */
    var screenX: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent#screenY)
     */
    var screenY: Int?
}
