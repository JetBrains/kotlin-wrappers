// Automatically generated - do not modify!

package web.screen

import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * A screen, usually the one on which the current window is being rendered, and is obtained using window.screen.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen)
 */
external class Screen
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availHeight)
     */
    val availHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availWidth)
     */
    val availWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/colorDepth)
     */
    val colorDepth: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/height)
     */
    val height: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/orientation)
     */
    val orientation: ScreenOrientation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/pixelDepth)
     */
    val pixelDepth: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/width)
     */
    val width: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, Screen /* this */, Screen /* this */>
}
