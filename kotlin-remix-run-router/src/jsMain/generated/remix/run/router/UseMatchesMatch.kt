package remix.run.router


sealed external interface UseMatchesMatch {
    var id: String
    var pathname: String
    var params: Params
    var data: Any?
    var handle: Any?
}
