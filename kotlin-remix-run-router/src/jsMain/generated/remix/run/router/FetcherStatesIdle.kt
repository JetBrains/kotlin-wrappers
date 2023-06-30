package remix.run.router


sealed external interface FetcherStatesIdle<TData> {
    var state: String
    var formMethod: Nothing?
    var formAction: Nothing?
    var formEncType: Nothing?
    var text: Nothing?
    var formData: Nothing?
    var json: Nothing?
    var data: TData?
    var String: Boolean?
}
