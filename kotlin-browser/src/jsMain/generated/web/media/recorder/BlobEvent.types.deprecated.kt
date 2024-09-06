// Automatically generated - do not modify!

package web.media.recorder

import seskar.js.JsValue
import web.events.EventType

sealed external class BlobEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("BlobEvent.DATA_AVAILABLE"),
    )
    @JsValue("dataavailable")
    fun dataAvailable(): EventType<BlobEvent>
}
