package remix.run.router


sealed external interface FetcherStatesSubmitting<TData> {
    var state: String
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var text: String?
    var formData: Any?
    var json: JsonValue?
    var data: TData?
    var String: Boolean?
}
