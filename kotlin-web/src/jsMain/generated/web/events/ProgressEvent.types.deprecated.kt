// Automatically generated - do not modify!

package web.events

import seskar.js.JsValue

sealed external class ProgressEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.ABORT"),
    )
    @JsValue("abort")
    fun abort(): EventType<ProgressEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.ERROR"),
    )
    @JsValue("error")
    fun error(): EventType<ProgressEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.LOAD"),
    )
    @JsValue("load")
    fun load(): EventType<ProgressEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.LOAD_END"),
    )
    @JsValue("loadend")
    fun loadEnd(): EventType<ProgressEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.LOAD_START"),
    )
    @JsValue("loadstart")
    fun loadStart(): EventType<ProgressEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.PROGRESS"),
    )
    @JsValue("progress")
    fun progress(): EventType<ProgressEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ProgressEvent.TIMEOUT"),
    )
    @JsValue("timeout")
    fun timeout(): EventType<ProgressEvent>
}
