// Automatically generated - do not modify!

package web.events

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import kotlin.js.definedExternally

/**
 * Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent)
 */
open external class ProgressEvent(
    override val type: EventType<ProgressEvent>,
    init: ProgressEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/lengthComputable)
     */
    val lengthComputable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/loaded)
     */
    val loaded: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/total)
     */
    val total: Double

    @JsAlias(THIS)
    override fun asInit(): ProgressEventInit

    companion object {
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
}
