// Automatically generated - do not modify!

package web.form

import web.dom.NodeListOf
import web.html.HTMLFormElement
import web.html.HTMLLabelElement
import web.validation.ValidationTarget

external interface FormControl :
    ValidationTarget {
    val form: HTMLFormElement?
    val labels: NodeListOf<HTMLLabelElement>?
        get() = definedExternally
    var name: String
}
