// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ChangeEventHandler
import web.dom.Element

external interface TextareaHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var autoComplete: AutoComplete?
    var autoFocus: Boolean?
    var cols: Int?
    var dirName: String?
    var disabled: Boolean?
    var form: String?
    var maxLength: Int?
    var minLength: Int?
    var name: String?
    override var placeholder: String?
    var readOnly: Boolean?
    var required: Boolean?
    var rows: Int?
    var value: Any? /* string | ReadonlyArray<string> | number */
    var wrap: String?
    var onChange: ChangeEventHandler<T>?
}
