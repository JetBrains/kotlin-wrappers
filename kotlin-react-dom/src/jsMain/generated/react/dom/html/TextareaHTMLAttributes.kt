// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ChangeEventHandler
import web.autofill.AutoFill
import web.dom.Element

external interface TextareaHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var autoComplete: AutoFill?
    var cols: Int?
    var dirName: String?
    var disabled: Boolean?
    var form: String?
    var maxLength: Int?
    var minLength: Int?
    var name: String?
    var placeholder: String?
    var readOnly: Boolean?
    var required: Boolean?
    var rows: Int?
    var value: Any? // string | readonly string[] | number
    var wrap: String?
    var onChange: ChangeEventHandler<T>?
}
