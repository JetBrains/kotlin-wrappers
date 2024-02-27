// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsValue
import web.events.EventType

sealed external interface OfflineAudioCompletionEventTypes_deprecated {
    @JsValue("complete")
    val COMPLETE: EventType<OfflineAudioCompletionEvent<*>>
        get() = definedExternally
}
