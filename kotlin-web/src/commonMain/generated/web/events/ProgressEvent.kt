// Automatically generated - do not modify!

package web.events

import js.reflect.unsafeCast
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

    companion object
}

inline fun ProgressEvent.asInit(): ProgressEventInit =
    unsafeCast(this)

inline val ProgressEvent.Companion.ABORT: EventType<ProgressEvent>
    get() = EventType("abort")

inline val ProgressEvent.Companion.ERROR: EventType<ProgressEvent>
    get() = EventType("error")

inline val ProgressEvent.Companion.LOAD: EventType<ProgressEvent>
    get() = EventType("load")

inline val ProgressEvent.Companion.LOAD_END: EventType<ProgressEvent>
    get() = EventType("loadend")

inline val ProgressEvent.Companion.LOAD_START: EventType<ProgressEvent>
    get() = EventType("loadstart")

inline val ProgressEvent.Companion.PROGRESS: EventType<ProgressEvent>
    get() = EventType("progress")

inline val ProgressEvent.Companion.TIMEOUT: EventType<ProgressEvent>
    get() = EventType("timeout")
