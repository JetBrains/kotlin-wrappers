// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.recorder

import web.blob.Blob
import web.events.Event
import web.events.EventTarget
import web.events.EventType
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent)
 */
open external class BlobEvent<out C : EventTarget?>(
    override val type: EventType<BlobEvent<EventTarget>>,
    init: BlobEventInit,
) : Event<C>,
    BlobEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/data)
     */
    override val data: Blob

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/timecode)
     */
    override val timecode: DOMHighResTimeStamp

    companion object : BlobEventTypes
}
