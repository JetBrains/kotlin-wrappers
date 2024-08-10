package react.dom

import seskar.js.JsTypeGuard
import web.form.FormData
import web.form.FormMethod

@JsTypeGuard(
    property = "pending",
    value = "true",
)
external class FormStatusPending
private constructor() :
    FormStatus {
    val data: FormData
    val method: FormMethod
    val action: FormAction
}
