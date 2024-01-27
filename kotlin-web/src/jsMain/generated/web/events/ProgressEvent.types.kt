// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.events

import seskar.js.JsValue

sealed external interface ProgressEventTypes {
    @JsValue("abort")
    val ABORT: EventType<ProgressEvent<*>>
        get() = definedExternally

    @JsValue("error")
    val ERROR: EventType<ProgressEvent<*>>
        get() = definedExternally

    @JsValue("load")
    val LOAD: EventType<ProgressEvent<*>>
        get() = definedExternally

    @JsValue("loadend")
    val LOAD_END: EventType<ProgressEvent<*>>
        get() = definedExternally

    @JsValue("loadstart")
    val LOAD_START: EventType<ProgressEvent<*>>
        get() = definedExternally

    @JsValue("progress")
    val PROGRESS: EventType<ProgressEvent<*>>
        get() = definedExternally

    @JsValue("timeout")
    val TIMEOUT: EventType<ProgressEvent<*>>
        get() = definedExternally
}
