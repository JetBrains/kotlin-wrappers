// Automatically generated - do not modify!

package web.events

import seskar.js.JsValue

sealed external class ProgressEventTypes :
    ProgressEventTypes_deprecated {

    @JsValue("abort")
    val ABORT: EventType<ProgressEvent>

    @JsValue("error")
    val ERROR: EventType<ProgressEvent>

    @JsValue("load")
    val LOAD: EventType<ProgressEvent>

    @JsValue("loadend")
    val LOAD_END: EventType<ProgressEvent>

    @JsValue("loadstart")
    val LOAD_START: EventType<ProgressEvent>

    @JsValue("progress")
    val PROGRESS: EventType<ProgressEvent>

    @JsValue("timeout")
    val TIMEOUT: EventType<ProgressEvent>
}
