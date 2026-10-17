// Automatically generated - do not modify!

package web.navigation

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.dom.Element
import web.events.EventInit
import web.form.FormData

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#options)
 */
@JsPlainObject
external interface NavigateEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#canIntercept)
     */
    var canIntercept: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#destination)
     */
    var destination: NavigationDestination

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#downloadRequest)
     */
    var downloadRequest: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#formData)
     */
    var formData: FormData?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#hasUAVisualTransition)
     */
    var hasUAVisualTransition: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#hashChange)
     */
    var hashChange: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#info)
     */
    var info: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#navigationType)
     */
    var navigationType: NavigationType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#signal)
     */
    var signal: AbortSignal

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#sourceElement)
     */
    var sourceElement: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#userInitiated)
     */
    var userInitiated: Boolean?
}
