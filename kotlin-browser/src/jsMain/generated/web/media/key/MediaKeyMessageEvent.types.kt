// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class MediaKeyMessageEventTypes {

    @JsValue("message")
    fun <C : EventTarget> message(): EventType<MediaKeyMessageEvent, C>
}
