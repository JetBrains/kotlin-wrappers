@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.http.FormData


sealed external interface BaseSubmissionOptions {
    var formMethod: HTMLFormMethod?
    var formEncType: FormEncType?
    var formData: FormData?
    var body: Any?
}
