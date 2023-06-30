package remix.run.router


sealed external interface NavigationStatesLoading {
    var state: String
    var location: Location
    var formMethod: Any /* LowerCaseFormMethod | "GET" | "POST" | "PUT" | "PATCH" | "DELETE" */?
    var formAction: String?
    var formEncType: FormEncType?
    var formData: Any?
    var json: JsonValue?
    var text: String?
}
