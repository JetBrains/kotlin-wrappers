// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue
import web.events.EventType

sealed external class MediaKeyMessageEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MediaKeyMessageEvent.MESSAGE"),
    )
    @JsValue("message")
    fun message(): EventType<MediaKeyMessageEvent>
}
