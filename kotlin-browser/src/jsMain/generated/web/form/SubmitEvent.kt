// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.form

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventType
import web.html.HTMLElement

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent)
 */
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

    @JsAlias(THIS)
    override fun asInit(): SubmitEventInit

    companion object : SubmitEventTypes
}
