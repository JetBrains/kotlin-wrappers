// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInit

external interface OfflineAudioCompletionEventInit : EventInit {
    var renderedBuffer: Any /* AudioBuffer */
}

open external class OfflineAudioCompletionEvent(
    type: String,
    init: OfflineAudioCompletionEventInit,
) : Event {
    val renderedBuffer: Any /* AudioBuffer */

    companion object
}
