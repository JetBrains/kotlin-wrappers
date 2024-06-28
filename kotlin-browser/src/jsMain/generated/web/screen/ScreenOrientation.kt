// Automatically generated - do not modify!

package web.screen

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation)
 */
sealed external class ScreenOrientation :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/angle)
     */
    val angle: Short
    var onchange: EventHandler<Event, ScreenOrientation, EventTarget>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type)
     */
    val type: OrientationType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/unlock)
     */
    fun unlock()
}
