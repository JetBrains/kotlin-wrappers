// Automatically generated - do not modify!

package web.events

import seskar.js.JsValue

sealed external class ProgressEventTypes_deprecated {

    @JsValue("abort")
    fun abort(): EventType<ProgressEvent>

    @JsValue("error")
    fun error(): EventType<ProgressEvent>

    @JsValue("load")
    fun load(): EventType<ProgressEvent>

    @JsValue("loadend")
    fun loadEnd(): EventType<ProgressEvent>

    @JsValue("loadstart")
    fun loadStart(): EventType<ProgressEvent>

    @JsValue("progress")
    fun progress(): EventType<ProgressEvent>

    @JsValue("timeout")
    fun timeout(): EventType<ProgressEvent>
}
