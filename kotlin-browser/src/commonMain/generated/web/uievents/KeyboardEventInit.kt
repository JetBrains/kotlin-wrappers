// Automatically generated - do not modify!

package web.uievents

import js.objects.JsPlainObject
import web.keyboard.KeyCode

@JsPlainObject
external interface KeyboardEventInit :
    EventModifierInit {
    var code: KeyCode?
    var isComposing: Boolean?
    var key: String?
    var location: KeyLocation?
    var repeat: Boolean?
}
