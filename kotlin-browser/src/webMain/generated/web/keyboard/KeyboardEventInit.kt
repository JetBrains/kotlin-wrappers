// Automatically generated - do not modify!

package web.keyboard

import js.objects.JsPlainObject
import web.uievents.EventModifierInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#options)
 */
@JsPlainObject
external interface KeyboardEventInit :
    EventModifierInit {
    var code: KeyCode?
    var isComposing: Boolean?
    var key: String?
    var location: KeyLocation?
    var repeat: Boolean?
}
