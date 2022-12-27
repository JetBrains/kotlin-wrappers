// Automatically generated - do not modify!

package dom.events

import dom.html.HTMLElement
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface SubmitEventInit : EventInit {
    var submitter: HTMLElement?
}

open external class SubmitEvent(
    type: EventType<SubmitEvent>,
    init: SubmitEventInit = definedExternally,
) : Event {
    /** Returns the element representing the submit button that triggered the form submission, or null if the submission was not triggered by a button. */
    val submitter: HTMLElement?

    companion object
}
