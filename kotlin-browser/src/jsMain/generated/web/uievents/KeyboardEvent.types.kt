// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class KeyboardEventTypes {

    @JsValue("keydown")
    fun <C : EventTarget> keyDown(): EventType<KeyboardEvent<C>>

    @JsValue("keypress")
    fun <C : EventTarget> keyPress(): EventType<KeyboardEvent<C>>

    @JsValue("keyup")
    fun <C : EventTarget> keyUp(): EventType<KeyboardEvent<C>>
}
