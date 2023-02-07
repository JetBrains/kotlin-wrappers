// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ChangeEventHandler
import web.dom.Element

external interface SelectHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var autoComplete: AutoComplete?
    var autoFocus: Boolean?
    var disabled: Boolean?
    var form: String?
    var multiple: Boolean?
    var name: String?
    var required: Boolean?
    var size: Int?
    var value: Any? /* string | ReadonlyArray<string> | number */
    var onChange: ChangeEventHandler<T>?
}
