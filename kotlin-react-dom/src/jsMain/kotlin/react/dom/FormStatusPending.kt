package react.dom

import web.form.FormData

external interface FormStatusPending :
    FormStatus {
    val pending: Boolean
    val data: FormData
    val method: String
    val action: (formData: FormData) -> Unit
}
