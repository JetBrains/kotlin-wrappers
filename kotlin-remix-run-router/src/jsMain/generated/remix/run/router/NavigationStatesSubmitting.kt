package remix.run.router

import web.http.FormData


sealed external interface NavigationStatesSubmitting {
    var state: String /* "submitting" */
    var location: Location
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var formData: FormData?
    var json: JsonValue?
    var text: String?
}
