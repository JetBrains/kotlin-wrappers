// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ChangeEventHandler
import web.autofill.AutoFill
import web.dom.Element
import web.html.HTMLSelectElement

external interface SelectHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var autoComplete: AutoFill?
    var disabled: Boolean?
    var form: String?
    var multiple: Boolean?
    var name: String?
    var required: Boolean?
    var size: Int?
    var value: Any? // string | readonly string[] | number

    // No other element dispatching change events can be nested in a <select>
// so we know the target will be a HTMLSelectElement.
    var onChange: ChangeEventHandler<T, HTMLSelectElement>?
}
