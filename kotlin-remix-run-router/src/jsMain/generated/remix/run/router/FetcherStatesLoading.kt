package remix.run.router


sealed external interface FetcherStatesLoading<TData> {
    var state: String
    var formMethod: Any /* LowerCaseFormMethod | "GET" | "POST" | "PUT" | "PATCH" | "DELETE" */?
    var formAction: String?
    var formEncType: FormEncType?
    var text: String??
    var formData: Any??
    var json: JsonValue??
    var data: TData?
    var String: Boolean?
}
