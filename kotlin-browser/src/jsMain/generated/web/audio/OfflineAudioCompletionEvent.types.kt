// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class OfflineAudioCompletionEventTypes {

    @JsValue("complete")
    fun <C : EventTarget> complete(): EventType<OfflineAudioCompletionEvent, C>
}
