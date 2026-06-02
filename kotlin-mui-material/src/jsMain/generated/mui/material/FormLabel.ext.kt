// Automatically generated - do not modify!

package mui.material

import react.dom.html.LabelHTMLAttributes
import seskar.js.JsValue
import web.html.HTMLLabelElement

typealias FormLabelBaseProps = LabelHTMLAttributes<HTMLLabelElement>

sealed external interface FormLabelColor {
    companion object {
        @JsValue("primary")
        val primary: FormLabelColor

        @JsValue("secondary")
        val secondary: FormLabelColor

        @JsValue("error")
        val error: FormLabelColor

        @JsValue("info")
        val info: FormLabelColor

        @JsValue("success")
        val success: FormLabelColor

        @JsValue("warning")
        val warning: FormLabelColor
    }
}
