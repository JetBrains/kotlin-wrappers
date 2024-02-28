// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.events

import seskar.js.JsValue

sealed external interface ProgressEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.abort()"),
    )
    @JsValue("abort")
    val ABORT: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.error()"),
    )
    @JsValue("error")
    val ERROR: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.load()"),
    )
    @JsValue("load")
    val LOAD: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.loadEnd()"),
    )
    @JsValue("loadend")
    val LOAD_END: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.loadStart()"),
    )
    @JsValue("loadstart")
    val LOAD_START: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.progress()"),
    )
    @JsValue("progress")
    val PROGRESS: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ProgressEvent.timeout()"),
    )
    @JsValue("timeout")
    val TIMEOUT: EventType<ProgressEvent<EventTarget>>
        get() = definedExternally
}
