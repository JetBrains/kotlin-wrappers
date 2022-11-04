// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package dom.events

import dom.html.HTMLElement
import web.events.Event
import web.events.EventInit

external interface SubmitEventInit : EventInit {
    var submitter: HTMLElement?
}

open external class SubmitEvent(
    type: String,
    eventInitDict: SubmitEventInit = definedExternally,
) : Event {
    /** Returns the element representing the submit button that triggered the form submission, or null if the submission was not triggered by a button. */
    val submitter: HTMLElement?

    companion object
}
