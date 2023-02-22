@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.http.FormData

/**
 * Options for a navigate() call for a Form navigation
 */

external interface SubmissionNavigateOptions {
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
    var formMethod: FormMethod?
    var formEncType: FormEncType?
    var formData: FormData
}

