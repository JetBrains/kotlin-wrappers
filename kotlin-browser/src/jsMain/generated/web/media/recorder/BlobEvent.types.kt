// Automatically generated - do not modify!

package web.media.recorder

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class BlobEventTypes {

    @JsValue("dataavailable")
    fun <C : EventTarget> dataAvailable(): EventType<BlobEvent, C>
}
