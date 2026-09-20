// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.html.HTMLElement
import web.html.HTMLFormElement

external interface SubmitEvent<out T : Element> : SyntheticEvent<T, NativeSubmitEvent> {
    val submitter: HTMLElement?

    // SubmitEvents are always targetted at HTMLFormElements.
    override val target: HTMLFormElement
}
