// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.events

import seskar.js.JsValue

sealed external interface EventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.abort()"),
    )
    @JsValue("abort")
    val ABORT: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.cancel()"),
    )
    @JsValue("cancel")
    val CANCEL: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.change()"),
    )
    @JsValue("change")
    val CHANGE: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.close()"),
    )
    @JsValue("close")
    val CLOSE: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.closing()"),
    )
    @JsValue("closing")
    val CLOSING: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.complete()"),
    )
    @JsValue("complete")
    val COMPLETE: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.error()"),
    )
    @JsValue("error")
    val ERROR: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.open()"),
    )
    @JsValue("open")
    val OPEN: EventType<Event<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("Event.success()"),
    )
    @JsValue("success")
    val SUCCESS: EventType<Event<*>>
        get() = definedExternally
}
