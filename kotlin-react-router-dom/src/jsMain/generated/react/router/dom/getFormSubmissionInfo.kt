@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import web.html.HTMLButtonElement
import web.html.HTMLFormElement
import web.html.HTMLInputElement
import web.http.FormData
import web.url.URLSearchParams

external fun getFormSubmissionInfo(target: HTMLFormElement?, defaultAction: String, options: SubmitOptions): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: HTMLButtonElement?, defaultAction: String, options: SubmitOptions): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: HTMLInputElement?, defaultAction: String, options: SubmitOptions): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: FormData?, defaultAction: String, options: SubmitOptions): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: URLSearchParams?, defaultAction: String, options: SubmitOptions): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: js.core.ReadonlyRecord<String, String>?, defaultAction: String, options: SubmitOptions): GetFormSubmissionInfoResult
