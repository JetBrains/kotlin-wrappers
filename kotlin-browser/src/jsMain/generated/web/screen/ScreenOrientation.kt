// Automatically generated - do not modify!

package web.screen

import web.events.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation)
 */
external class ScreenOrientation
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/angle)
     */
    val angle: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/change_event)
     */
    var onchange: EventHandler<Event, ScreenOrientation, ScreenOrientation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type)
     */
    val type: OrientationType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/unlock)
     */
    fun unlock()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, ScreenOrientation /* this */, ScreenOrientation /* this */>
}
