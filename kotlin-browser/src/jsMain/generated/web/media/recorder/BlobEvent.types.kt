// Automatically generated - do not modify!

package web.media.recorder

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class BlobEventTypes {

    @JsValue("dataavailable")
    fun <C : EventTarget> dataAvailable(): EventType<BlobEvent<C>>
}
