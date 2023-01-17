@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import web.http.FormData

/**
 * @private
 * Internal interface to pass around for action submissions, not intended for
 * external consumption
 */

external interface Submission {
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var formData: FormData
}

