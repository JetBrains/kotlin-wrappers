package react.dom

import kotlinx.js.JsPlainObject
import web.form.FormData
import web.form.FormMethod

@JsPlainObject
external interface FormStatusPending :
    FormStatus {
    val data: FormData
    val method: FormMethod
    val action: FormAction
}
