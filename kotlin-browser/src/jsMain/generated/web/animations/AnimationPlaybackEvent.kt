// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.animations

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent)
 */
open external class AnimationPlaybackEvent(
    override val type: EventType<AnimationPlaybackEvent>,
    init: AnimationPlaybackEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/currentTime)
     */
    val currentTime: CSSNumberish?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/timelineTime)
     */
    val timelineTime: CSSNumberish?

    @JsAlias(THIS)
    override fun asInit(): AnimationPlaybackEventInit

    companion object {
        @JsValue("cancel")
        val CANCEL: EventType<AnimationPlaybackEvent>

        @JsValue("finish")
        val FINISH: EventType<AnimationPlaybackEvent>

        @JsValue("remove")
        val REMOVE: EventType<AnimationPlaybackEvent>
    }
}
