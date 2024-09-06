// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class KeyboardEventTypes {

    @JsValue("keydown")
    fun keyDown(): EventType<KeyboardEvent>

    @JsValue("keypress")
    fun keyPress(): EventType<KeyboardEvent>

    @JsValue("keyup")
    fun keyUp(): EventType<KeyboardEvent>
}
