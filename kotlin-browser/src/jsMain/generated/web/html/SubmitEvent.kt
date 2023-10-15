// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.html

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface SubmitEventInit : EventInit {
    var submitter: HTMLElement?
}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent) */
open external class SubmitEvent(
    override val type: EventType<SubmitEvent>,
    init: SubmitEventInit = definedExternally,
) : Event {
    /**
     * Returns the element representing the submit button that triggered the form submission, or null if the submission was not triggered by a button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent/submitter)
     */
    val submitter: HTMLElement?

    companion object
}
