package react.dom

import js.objects.JsPlainObject
import web.form.FormData
import web.form.FormMethod

@JsPlainObject
external interface FormStatusPending :
    FormStatus {
    val data: FormData
    val method: FormMethod
    val action: FormAction
}
