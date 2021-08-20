// Automatically generated - do not modify!

package react.dom

import org.w3c.dom.Element

external interface TextareaHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var autoComplete: String
    var autoFocus: Boolean
    var cols: Int
    var dirName: String
    var disabled: Boolean
    var form: String
    var maxLength: Int
    var minLength: Int
    var name: String
    override var placeholder: String
    var readOnly: Boolean
    var required: Boolean
    var rows: Int
    var value: String
    var wrap: String

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var onChange: ChangeEventHandler<T>
}
