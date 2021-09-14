// Automatically generated - do not modify!

package react.dom

import org.w3c.dom.Element

external interface SelectHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var autoComplete: String?
    var autoFocus: Boolean?
    var disabled: Boolean?
    var form: String?
    var multiple: Boolean?
    var name: String?
    var required: Boolean?
    var size: Int?
    var value: String?

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var onChange: ChangeEventHandler<T>?
}
