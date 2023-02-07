package remix.run.router


external interface FetcherStatesIdle<TData> {
    var state: String
    var formMethod: Any? /* some expression */
    var formAction: Any? /* some expression */
    var formEncType: Any? /* some expression */
    var formData: Any? /* some expression */
    var data: TData?
    var String: Boolean?
}

