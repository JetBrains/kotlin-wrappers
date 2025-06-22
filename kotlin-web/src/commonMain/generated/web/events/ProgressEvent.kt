// Automatically generated - do not modify!

package web.events

import js.reflect.unsafeCast
import seskar.js.JsValue
import kotlin.js.definedExternally

/**
 * The **`ProgressEvent`** interface represents events that measure the progress of an underlying process, like an HTTP request (e.g., an `XMLHttpRequest`, or the loading of the underlying resource of an img, audio, video, style or link).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent)
 */
open external class ProgressEvent(
    override val type: EventType<ProgressEvent>,
    init: ProgressEventInit = definedExternally,
) : Event {
    /**
     * The **`ProgressEvent.lengthComputable`** read-only property is a boolean flag indicating if the resource concerned by the A boolean.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/lengthComputable)
     */
    val lengthComputable: Boolean

    /**
     * The **`ProgressEvent.loaded`** read-only property is a number indicating the size of the data already transmitted or processed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/loaded)
     */
    val loaded: Double

    /**
     * The **`ProgressEvent.total`** read-only property is a number indicating the total size of the data being transmitted or processed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/total)
     */
    val total: Double

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

inline fun ProgressEvent.asInit(): ProgressEventInit =
    unsafeCast(this)
