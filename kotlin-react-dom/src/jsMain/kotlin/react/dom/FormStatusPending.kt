package react.dom

import js.core.Void
import js.promise.Promise
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
    val action: (formData: FormData) -> Promise<Void>?
}
