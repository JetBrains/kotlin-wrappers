// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class KeyboardEventTypes {

    @JsValue("keydown")
    val KEY_DOWN: EventType<KeyboardEvent>

    @JsValue("keypress")
    val KEY_PRESS: EventType<KeyboardEvent>

    @JsValue("keyup")
    val KEY_UP: EventType<KeyboardEvent>
}
