// Automatically generated - do not modify!

package web.close

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`CloseWatcher`** interface allows a custom UI component with open and close semantics to respond to device-specific close actions in the same way as a built-in component.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher)
 */
open external class CloseWatcher(
    options: CloseWatcherOptions = definedExternally,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/cancel_event)
     */
    var oncancel: EventHandler<Event, CloseWatcher, CloseWatcher>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/close_event)
     */
    var onclose: EventHandler<Event, CloseWatcher, CloseWatcher>?

    /**
     * The **`close()`** method of the CloseWatcher interface lets you skip any logic in the cancel event handler and immediately fire the close event. It then deactivates the close watcher as if destroy() was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/close)
     */
    fun close()

    /**
     * The **`destroy()`** method of the CloseWatcher interface deactivates the close watcher. This is intended to be called if the relevant UI element is torn down in some other way than being closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/destroy)
     */
    fun destroy()

    /**
     * The **`requestClose()`** method of the CloseWatcher interface fires a cancel event and if that event is not canceled with Event.preventDefault(), proceeds to fire a close event, and then finally deactivates the close watcher as if destroy() was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/requestClose)
     */
    fun requestClose()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/cancel_event)
 */
inline val <C : CloseWatcher> C.cancelEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "cancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/close_event)
 */
inline val <C : CloseWatcher> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "close")
