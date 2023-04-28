package react.router.dom

import web.http.FormData


sealed external interface GetFormSubmissionInfoResult {
    var action: String?
    var method: String
    var encType: String
    var formData: FormData
}
