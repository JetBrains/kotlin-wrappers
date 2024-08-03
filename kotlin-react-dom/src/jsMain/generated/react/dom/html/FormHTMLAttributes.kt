// Automatically generated - do not modify!

package react.dom.html

import react.dom.FormAction
import web.dom.Element
import web.form.FormEncType
import web.form.FormMethod
import web.window.WindowTarget

external interface FormHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var acceptCharset: String?
    var action: FormAction?
    var autoComplete: AutoComplete?
    var encType: FormEncType?
    var method: FormMethod?
    var name: String?
    var noValidate: Boolean?
    var target: WindowTarget?
}
