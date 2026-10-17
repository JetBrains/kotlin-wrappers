// Automatically generated - do not modify!

package web.mediarecorder

import kotlinx.js.JsPlainObject
import web.blob.Blob
import web.events.EventInit
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/BlobEvent#options)
 */
@JsPlainObject
external interface BlobEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/BlobEvent#data)
     */
    var data: Blob

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/BlobEvent#timecode)
     */
    var timecode: DOMHighResTimeStamp?
}
