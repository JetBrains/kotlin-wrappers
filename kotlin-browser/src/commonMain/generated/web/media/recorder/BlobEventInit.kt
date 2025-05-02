// Automatically generated - do not modify!

package web.media.recorder

import js.objects.JsPlainObject
import web.blob.Blob
import web.events.EventInit
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface BlobEventInit :
    EventInit {
    val data: Blob
    val timecode: DOMHighResTimeStamp?
}
