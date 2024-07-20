package react.dom

import js.core.Void
import js.promise.Promise
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
    val action: (formData: FormData) -> Promise<Void>?
}
