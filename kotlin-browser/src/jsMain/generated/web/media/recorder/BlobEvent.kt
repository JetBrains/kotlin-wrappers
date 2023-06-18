// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.recorder

import js.core.DOMHighResTimeStamp
import web.buffer.Blob
import web.events.Event
import web.events.EventType

external interface BlobEventInit {
    var data: Blob
    var timecode: DOMHighResTimeStamp?
}

open external class BlobEvent(
    override val type: EventType<BlobEvent>,
    init: BlobEventInit,
) : Event {
    val data: Blob
    val timecode: DOMHighResTimeStamp

    companion object
}
