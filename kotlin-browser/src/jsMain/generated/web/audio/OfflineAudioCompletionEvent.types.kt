// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class OfflineAudioCompletionEventTypes {

    @JsValue("complete")
    fun <C : EventTarget> complete(): EventType<OfflineAudioCompletionEvent, C>
}
