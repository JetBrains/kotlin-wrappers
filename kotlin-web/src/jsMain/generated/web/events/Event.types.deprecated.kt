// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.events

import seskar.js.JsValue

sealed external interface EventTypes {
    @JsValue("abort")
    val ABORT: EventType<Event<*>>
        get() = definedExternally

    @JsValue("cancel")
    val CANCEL: EventType<Event<*>>
        get() = definedExternally

    @JsValue("change")
    val CHANGE: EventType<Event<*>>
        get() = definedExternally

    @JsValue("close")
    val CLOSE: EventType<Event<*>>
        get() = definedExternally

    @JsValue("closing")
    val CLOSING: EventType<Event<*>>
        get() = definedExternally

    @JsValue("complete")
    val COMPLETE: EventType<Event<*>>
        get() = definedExternally

    @JsValue("error")
    val ERROR: EventType<Event<*>>
        get() = definedExternally

    @JsValue("open")
    val OPEN: EventType<Event<*>>
        get() = definedExternally

    @JsValue("success")
    val SUCCESS: EventType<Event<*>>
        get() = definedExternally
}
