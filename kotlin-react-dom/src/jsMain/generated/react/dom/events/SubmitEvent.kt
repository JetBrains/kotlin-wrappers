// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.html.HTMLFormElement

external interface SubmitEvent<out T : Element> : SyntheticEvent<T, NativeSubmitEvent> {
    // `submitter` is available in react@canary
// submitter: HTMLElement | null
// SubmitEvents are always targetted at HTMLFormElements.
    override val target: HTMLFormElement
}
