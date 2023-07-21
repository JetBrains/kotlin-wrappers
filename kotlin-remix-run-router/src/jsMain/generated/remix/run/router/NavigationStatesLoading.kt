package remix.run.router

import web.http.FormData


sealed external interface NavigationStatesLoading {
    var state: String /* "loading" */
    var location: Location
    var formMethod: (Any /* Submission["formMethod"] | undefined */)?
    var formAction: (String)?
    var formEncType: (FormEncType)?
    var formData: FormData?
    var json: JsonValue?
    var text: String?
}
