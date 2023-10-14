package remix.run.router


sealed external interface FetcherStatesIdle<TData /* default is Any? */> {
    var state: String /* "idle" */
    var formMethod: Nothing?
    var formAction: Nothing?
    var formEncType: Nothing?
    var text: Nothing?
    var formData: Nothing?
    var json: Nothing?
    var data: TData?
}
