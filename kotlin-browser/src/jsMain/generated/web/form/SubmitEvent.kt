// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.form

import web.events.Event
import web.events.EventTarget
import web.events.EventType
import web.html.HTMLElement

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent)
 */
open external class SubmitEvent<out C : EventTarget?>(
    override val type: EventType<SubmitEvent<C>>,
    init: SubmitEventInit = definedExternally,
) : Event<C>,
    SubmitEventInit {
    /**
     * Returns the element representing the submit button that triggered the form submission, or null if the submission was not triggered by a button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent/submitter)
     */
    override val submitter: HTMLElement?

    companion object : SubmitEventTypes
}
