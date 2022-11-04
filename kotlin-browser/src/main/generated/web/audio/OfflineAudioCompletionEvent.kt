// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import web.events.Event
import web.events.EventInit

external interface OfflineAudioCompletionEventInit : EventInit {
    var renderedBuffer: Any /* AudioBuffer */
}

sealed external class OfflineAudioCompletionEvent : Event {
    companion object
}
