// Automatically generated - do not modify!

package web.screen

import web.events.*

/**
 * The **`ScreenOrientation`** interface of the Screen Orientation API provides information about the current orientation of the document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation)
 */
external class ScreenOrientation
private constructor() :
    EventTarget {
    /**
     * The **`angle`** read-only property of the angle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/angle)
     */
    val angle: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/change_event)
     */
    var onchange: EventHandler<Event, ScreenOrientation, ScreenOrientation>?

    /**
     * The **`type`** read-only property of the type, one of `portrait-primary`, `portrait-secondary`, `landscape-primary`, or `landscape-secondary`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type)
     */
    val type: OrientationType

    /**
     * The **`unlock()`** method of the document from its default orientation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/unlock)
     */
    fun unlock()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, ScreenOrientation /* this */, ScreenOrientation /* this */>
}
