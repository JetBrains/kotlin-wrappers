// Automatically generated - do not modify!

package web.events

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external class EventTypes {

    @JsValue("abort")
    fun <C : EventTarget> abort(): EventType<Event, C>

    @JsValue("cancel")
    fun <C : EventTarget> cancel(): EventType<Event, C>

    @JsValue("change")
    fun <C : EventTarget> change(): EventType<Event, C>

    @JsValue("close")
    fun <C : EventTarget> close(): EventType<Event, C>

    @JsValue("closing")
    fun <C : EventTarget> closing(): EventType<Event, C>

    @JsValue("complete")
    fun <C : EventTarget> complete(): EventType<Event, C>

    @JsValue("error")
    fun <C : EventTarget> error(): EventType<Event, C>

    @JsValue("open")
    fun <C : EventTarget> open(): EventType<Event, C>

    @JsValue("success")
    fun <C : EventTarget> success(): EventType<Event, C>
}
