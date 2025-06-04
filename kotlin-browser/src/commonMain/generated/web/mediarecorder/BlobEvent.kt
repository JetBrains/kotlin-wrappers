// Automatically generated - do not modify!

package web.mediarecorder

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.blob.Blob
import web.events.Event
import web.events.EventType
import web.time.DOMHighResTimeStamp

/**
 * The **`BlobEvent`** interface of the MediaStream Recording API represents events associated with a Blob.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent)
 */
open external class BlobEvent(
    override val type: EventType<BlobEvent>,
    init: BlobEventInit,
) : Event {
    /**
     * The **`data`** read-only property of the BlobEvent interface represents a Blob associated with the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/data)
     */
    val data: Blob

    /**
     * The **`timecode`** read-only property of the BlobEvent interface indicates the difference between the timestamp of the first chunk of data, and the timestamp of the first chunk in the first `BlobEvent` produced by this recorder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/timecode)
     */
    val timecode: DOMHighResTimeStamp

    @JsAlias(THIS)
    override fun asInit(): BlobEventInit

    companion object {
        @JsValue("dataavailable")
        val DATA_AVAILABLE: EventType<BlobEvent>
    }
}
