@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.http.FormData

/**
 * Options for a navigate() call for a Form navigation
 */

sealed external interface SubmissionNavigateOptions : BaseNavigateOptions {
    var formMethod: HTMLFormMethod?
    var formEncType: FormEncType?
    var formData: FormData
}
