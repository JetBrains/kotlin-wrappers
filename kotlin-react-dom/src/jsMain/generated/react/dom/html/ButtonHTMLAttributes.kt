// Automatically generated - do not modify!

package react.dom.html

import react.dom.FormAction
import web.dom.Element
import web.form.FormMethod
import web.html.ButtonType
import web.window.WindowName

external interface ButtonHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var disabled: Boolean?
    var form: String?
    var formAction: FormAction?
    var formEncType: web.form.FormEncType?
    var formMethod: FormMethod?
    var formNoValidate: Boolean?
    var formTarget: WindowName?
    var name: String?
    var type: ButtonType?
    var value: Any? // string | readonly string[] | number
}
