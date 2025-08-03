package web.navigation

import js.core.JsAny
import web.abort.AbortSignal
import web.dom.Element
import web.events.Event
import web.events.EventType
import web.form.FormData
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent)
 */
open external class NavigateEvent(
    override val type: EventType<NavigateEvent>,
    init: NavigateEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType)
     */
    val navigationType: NavigationType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/destination)
     */
    val destination: NavigationDestination

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/canIntercept)
     */
    val canIntercept: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/userInitiated)
     */
    val userInitiated: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/hashChange)
     */
    val hashChange: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/signal)
     */
    val signal: AbortSignal

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/formData)
     */
    val formData: FormData?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/downloadRequest)
     */
    val downloadRequest: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/info)
     */
    val info: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/hasUAVisualTransition)
     */
    val hasUAVisualTransition: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/sourceElement)
     */
    val sourceElement: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept)
     */
    fun intercept(options: NavigationInterceptOptions = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/scroll)
     */
    fun scroll()
}
