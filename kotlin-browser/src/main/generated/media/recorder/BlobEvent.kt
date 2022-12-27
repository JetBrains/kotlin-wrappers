// Automatically generated - do not modify!

package media.recorder

import js.core.HighResTimeStamp
import web.buffer.Blob
import web.events.Event
import web.events.EventType

external interface BlobEventInit {
    var data: Blob
    var timecode: HighResTimeStamp?
}

open external class BlobEvent(
    type: EventType<BlobEvent>,
    init: BlobEventInit,
) : Event {
    val data: Blob
    val timecode: HighResTimeStamp

    companion object
}
