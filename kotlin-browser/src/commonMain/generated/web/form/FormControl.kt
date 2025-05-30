// Automatically generated - do not modify!

package web.form

import web.dom.NodeList
import web.html.HTMLFormElement
import web.html.HTMLLabelElement
import web.validation.ValidationTarget
import kotlin.js.definedExternally

external interface FormControl :
    ValidationTarget {
    val form: HTMLFormElement?
    val labels: NodeList<HTMLLabelElement>?
        get() = definedExternally
    var name: String
}
