// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package media.capture

import kotlinx.js.HighResTimeStamp
import web.buffer.Blob
import web.events.Event

external interface BlobEventInit {
    var data: Blob
    var timecode: HighResTimeStamp?
}

open external class BlobEvent(
    type: String,
    init: BlobEventInit,
) : Event {
    val data: Blob
    val timecode: HighResTimeStamp

    companion object
}
