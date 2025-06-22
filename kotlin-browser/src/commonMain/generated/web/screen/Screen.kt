// Automatically generated - do not modify!

package web.screen

import web.events.Event
import web.events.EventInstance
import web.events.EventTarget

/**
 * The `Screen` interface represents a screen, usually the one on which the current window is being rendered, and is obtained using window.screen.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen)
 */
external class Screen
private constructor() :
    EventTarget {
    /**
     * The read-only Screen interface's **`availHeight`** property returns the height, in CSS pixels, of the space available for Web content on the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availHeight)
     */
    val availHeight: Int

    /**
     * The **`Screen.availWidth`** property returns the amount of horizontal space (in CSS pixels) available to the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availWidth)
     */
    val availWidth: Int

    /**
     * The **`Screen.colorDepth`** read-only property returns the color depth of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/colorDepth)
     */
    val colorDepth: Int

    /**
     * The **`Screen.height`** read-only property returns the height of the screen in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/height)
     */
    val height: Int

    /**
     * The **`orientation`** read-only property of the An instance of ScreenOrientation representing the orientation of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/orientation)
     */
    val orientation: ScreenOrientation

    /**
     * Returns the bit depth of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/pixelDepth)
     */
    val pixelDepth: Int

    /**
     * The **`Screen.width`** read-only property returns the width of the screen in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/width)
     */
    val width: Int
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/change_event)
 */
inline val <C : Screen> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "change")
