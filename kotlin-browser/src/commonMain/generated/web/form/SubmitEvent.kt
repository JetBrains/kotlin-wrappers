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

    companion object {
        @JsValue("submit")
        val SUBMIT: EventType<SubmitEvent>
    }
}
