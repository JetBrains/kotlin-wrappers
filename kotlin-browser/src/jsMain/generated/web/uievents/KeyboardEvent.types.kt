// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class KeyboardEventTypes {

    @JsValue("keydown")
    fun <C : EventTarget> keyDown(): EventType<KeyboardEvent, C>

    @JsValue("keypress")
    fun <C : EventTarget> keyPress(): EventType<KeyboardEvent, C>

    @JsValue("keyup")
    fun <C : EventTarget> keyUp(): EventType<KeyboardEvent, C>
}
