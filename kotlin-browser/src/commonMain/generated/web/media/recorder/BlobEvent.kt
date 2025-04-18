// Automatically generated - do not modify!

package web.media.recorder

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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/data)
     */
    val data: Blob

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/timecode)
     */
    val timecode: DOMHighResTimeStamp

    companion object {
        @JsValue("dataavailable")
        val DATA_AVAILABLE: EventType<BlobEvent>
    }
}
