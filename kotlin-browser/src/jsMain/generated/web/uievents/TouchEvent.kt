// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.EventTarget
import web.events.EventType

/**
 * An event sent when the state of contacts with a touch-sensitive surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent)
 */
open external class TouchEvent(
    override val type: EventType<TouchEvent, EventTarget>,
    init: TouchEventInit = definedExternally,
) : UIEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/altKey)
     */
    val altKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/changedTouches)
     */
    val changedTouches: TouchList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/ctrlKey)
     */
    val ctrlKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/metaKey)
     */
    val metaKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/shiftKey)
     */
    val shiftKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/targetTouches)
     */
    val targetTouches: TouchList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/touches)
     */
    val touches: TouchList

    @JsAlias(THIS)
    override fun asInit(): TouchEventInit

    companion object : TouchEventTypes
}
