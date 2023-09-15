package remix.run.router

import web.http.FormData


sealed external interface FetcherStatesSubmitting<TData> {
    var state: String /* "submitting" */
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var text: String?
    var formData: FormData?
    var json: JsonValue?
    var data: TData?
}
