// Automatically generated - do not modify!

package web.events

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external class ProgressEventTypes :
    ProgressEventTypes_deprecated {

    @JsValue("abort")
    fun <C : EventTarget> abort(): EventType<ProgressEvent<C>>

    @JsValue("error")
    fun <C : EventTarget> error(): EventType<ProgressEvent<C>>

    @JsValue("load")
    fun <C : EventTarget> load(): EventType<ProgressEvent<C>>

    @JsValue("loadend")
    fun <C : EventTarget> loadEnd(): EventType<ProgressEvent<C>>

    @JsValue("loadstart")
    fun <C : EventTarget> loadStart(): EventType<ProgressEvent<C>>

    @JsValue("progress")
    fun <C : EventTarget> progress(): EventType<ProgressEvent<C>>

    @JsValue("timeout")
    fun <C : EventTarget> timeout(): EventType<ProgressEvent<C>>
}
