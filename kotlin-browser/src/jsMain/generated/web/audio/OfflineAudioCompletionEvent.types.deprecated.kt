// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface OfflineAudioCompletionEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("OfflineAudioCompletionEvent.complete()"),
    )
    @JsValue("complete")
    val COMPLETE: EventType<OfflineAudioCompletionEvent<EventTarget>>
        get() = definedExternally
}
