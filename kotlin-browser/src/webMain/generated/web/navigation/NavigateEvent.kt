// Automatically generated - do not modify!

package web.navigation

import web.abort.AbortSignal
import web.dom.Element
import web.events.Event
import web.events.EventType
import web.form.FormData
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`NavigateEvent`** interface of the Navigation API is the event object for the navigate event, which fires when any type of navigation is initiated (this includes usage of History API features like History.go()). NavigateEvent provides access to information about that navigation, and allows developers to intercept and control the navigation handling.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent)
 */
open external class NavigateEvent(
    override val type: EventType<NavigateEvent>,
    init: NavigateEventInit,
) : Event {
    /**
     * The **`canIntercept`** read-only property of the NavigateEvent interface returns true if the navigation can be intercepted and have its URL rewritten, or false otherwise
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/canIntercept)
     */
    val canIntercept: Boolean

    /**
     * The **`destination`** read-only property of the NavigateEvent interface returns a NavigationDestination object representing the destination being navigated to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/destination)
     */
    val destination: NavigationDestination

    /**
     * The **`downloadRequest`** read-only property of the NavigateEvent interface returns the filename of the file requested for download, in the case of a download navigation (e.g., an <a> or <area> element with a download attribute), or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/downloadRequest)
     */
    val downloadRequest: String?

    /**
     * The **`formData`** read-only property of the NavigateEvent interface returns the FormData object representing the submitted data in the case of a POST form submission, or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/formData)
     */
    val formData: FormData?

    /**
     * The **`hasUAVisualTransition`** read-only property of the NavigateEvent interface returns true if the user agent performed a visual transition for this navigation before dispatching this event, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/hasUAVisualTransition)
     */
    val hasUAVisualTransition: Boolean

    /**
     * The **`hashChange`** read-only property of the NavigateEvent interface returns true if the navigation is a fragment navigation (i.e., to a fragment identifier in the same document), or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/hashChange)
     */
    val hashChange: Boolean

    /**
     * The **`info`** read-only property of the NavigateEvent interface returns the info data value passed by the initiating navigation operation (e.g., Navigation.back(), or Navigation.navigate()), or undefined if no info data was passed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/info)
     */
    val info: JsAny?

    /**
     * The **`navigationType`** read-only property of the NavigateEvent interface returns the type of the navigation — push, reload, replace, or traverse.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType)
     */
    val navigationType: NavigationType

    /**
     * The **`signal`** read-only property of the NavigateEvent interface returns an AbortSignal, which will become aborted if the navigation is cancelled (e.g., by the user pressing the browser's "Stop" button, or another navigation starting and thus cancelling the ongoing one).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/signal)
     */
    val signal: AbortSignal

    /**
     * The **`sourceElement`** read-only property of the NavigateEvent interface returns an Element object representing the initiating element, in cases where the navigation was initiated by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/sourceElement)
     */
    val sourceElement: Element?

    /**
     * The **`userInitiated`** read-only property of the NavigateEvent interface returns true if the navigation was initiated by the user (e.g., by clicking a link, submitting a form, or pressing the browser's "Back"/"Forward" buttons), or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/userInitiated)
     */
    val userInitiated: Boolean

    /**
     * The **`intercept()`** method of the NavigateEvent interface intercepts this navigation, turning it into a same-document navigation to the destination URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept)
     */
    fun intercept(options: NavigationInterceptOptions = definedExternally)

    /**
     * The **`scroll()`** method of the NavigateEvent interface can be called to manually trigger the browser-driven scrolling behavior that occurs in response to the navigation, if you want it to happen before the navigation handling has completed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/scroll)
     */
    fun scroll()

    companion object
}

inline val NavigateEvent.Companion.NAVIGATE: EventType<NavigateEvent>
    get() = EventType("navigate")
