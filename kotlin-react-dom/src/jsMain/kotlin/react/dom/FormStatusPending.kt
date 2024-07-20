package react.dom

import seskar.js.JsTypeGuard
import web.form.FormData

@JsTypeGuard(
    property = "pending",
    value = "true",
)
external class FormStatusPending
private constructor() :
    FormStatus {
    val data: FormData
    val method: String
    val action: (formData: FormData) -> Unit
}
