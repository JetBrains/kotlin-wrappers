// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class FetchEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FetchEvent.FETCH"),
    )
    @JsValue("fetch")
    fun fetch(): EventType<FetchEvent>
}
