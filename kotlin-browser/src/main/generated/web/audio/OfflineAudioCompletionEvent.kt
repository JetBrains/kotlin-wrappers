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

open external class OfflineAudioCompletionEvent(
    type: String,
    eventInitDict: OfflineAudioCompletionEventInit,
) : Event {
    val renderedBuffer: Any /* AudioBuffer */

    companion object
}
