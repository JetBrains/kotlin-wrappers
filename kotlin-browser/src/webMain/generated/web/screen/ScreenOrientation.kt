// Automatically generated - do not modify!

package web.screen

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName

/**
 * The **`ScreenOrientation`** interface of the Screen Orientation API provides information about the current orientation of the document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation)
 */
open external class ScreenOrientation
private constructor() :
    EventTarget {
    /**
     * The **`angle`** read-only property of the ScreenOrientation interface returns the document's current orientation angle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/angle)
     */
    val angle: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/change_event)
     */
    var onchange: EventHandler<Event, ScreenOrientation, ScreenOrientation>?

    /**
     * The **`type`** read-only property of the ScreenOrientation interface returns the document's current orientation type, one of `portrait-primary`, `portrait-secondary`, `landscape-primary`, or `landscape-secondary`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type)
     */
    val type: OrientationType

    /**
     * The **`lock()`** method of the ScreenOrientation interface locks the orientation of the containing document to the specified orientation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/lock)
     */
    @JsName("lock")
    fun lockAsync(orientation: OrientationLockType): Promise<Void>

    /**
     * The **`unlock()`** method of the ScreenOrientation interface unlocks the orientation of the containing document, effectively locking it to the default screen orientation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/unlock)
     */
    fun unlock()
}

/**
 * The **`lock()`** method of the ScreenOrientation interface locks the orientation of the containing document to the specified orientation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/lock)
 */
suspend inline fun ScreenOrientation.lock(orientation: OrientationLockType) {
    lockAsync(
        orientation = orientation,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/change_event)
 */
inline val <C : ScreenOrientation> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "change")
