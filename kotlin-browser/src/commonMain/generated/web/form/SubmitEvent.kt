// Automatically generated - do not modify!

package web.form

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import web.html.HTMLElement
import kotlin.js.definedExternally

/**
 * The **`SubmitEvent`** interface defines the object used to represent an HTML form's HTMLFormElement.submit_event event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent)
 */
open external class SubmitEvent(
    override val type: EventType<SubmitEvent>,
    init: SubmitEventInit = definedExternally,
) : Event {
    /**
     * The read-only **`submitter`** property found on the SubmitEvent interface specifies the submit button or other element that was invoked to cause the form to be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent/submitter)
     */
    val submitter: HTMLElement?

    @JsAlias(THIS)
    override fun asInit(): SubmitEventInit

    companion object {
        @JsValue("submit")
        val SUBMIT: EventType<SubmitEvent>
    }
}
