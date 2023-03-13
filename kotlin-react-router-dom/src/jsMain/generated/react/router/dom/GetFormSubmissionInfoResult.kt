package react.router.dom

import web.http.FormData
import web.url.URL


sealed external interface GetFormSubmissionInfoResult {
    var url: URL
    var method: String
    var encType: String
    var formData: FormData
}
