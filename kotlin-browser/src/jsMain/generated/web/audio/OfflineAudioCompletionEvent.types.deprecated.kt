// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import web.events.EventType

sealed external class OfflineAudioCompletionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("OfflineAudioCompletionEvent.COMPLETE"),
    )
    @JsValue("complete")
    fun complete(): EventType<OfflineAudioCompletionEvent>
}
