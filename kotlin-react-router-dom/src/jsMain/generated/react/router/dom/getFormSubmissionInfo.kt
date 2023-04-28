@file:JsModule("react-router-dom")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import web.html.HTMLButtonElement
import web.html.HTMLFormElement
import web.html.HTMLInputElement
import web.http.FormData
import web.url.URLSearchParams

external fun getFormSubmissionInfo(target: HTMLFormElement?, options: SubmitOptions, basename: String): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: HTMLButtonElement?, options: SubmitOptions, basename: String): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: HTMLInputElement?, options: SubmitOptions, basename: String): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: FormData?, options: SubmitOptions, basename: String): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: URLSearchParams?, options: SubmitOptions, basename: String): GetFormSubmissionInfoResult

external fun getFormSubmissionInfo(target: js.core.ReadonlyRecord<String, String>?, options: SubmitOptions, basename: String): GetFormSubmissionInfoResult
