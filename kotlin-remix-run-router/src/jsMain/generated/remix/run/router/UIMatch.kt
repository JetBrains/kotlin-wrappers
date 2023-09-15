package remix.run.router


sealed external interface UIMatch<Data /* default is Any? */, Handle /* default is Any? */> {
    var id: String
    var pathname: String
    var params: Params
    var data: Data
    var handle: Handle
}
