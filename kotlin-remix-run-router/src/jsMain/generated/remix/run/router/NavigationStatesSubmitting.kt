package remix.run.router


sealed external interface NavigationStatesSubmitting {
    var state: String /* "submitting" */
    var location: Location
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var formData: Any?
    var json: JsonValue?
    var text: String?
}
