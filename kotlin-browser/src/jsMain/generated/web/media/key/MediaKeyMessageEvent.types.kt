// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MediaKeyMessageEventTypes :
    MediaKeyMessageEventTypes_deprecated {

    @JsValue("message")
    fun <C : EventTarget> message(): EventType<MediaKeyMessageEvent<C>>
}
