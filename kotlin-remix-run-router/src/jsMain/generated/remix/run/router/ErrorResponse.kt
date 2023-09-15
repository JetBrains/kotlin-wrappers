package remix.run.router


sealed external interface ErrorResponse {
    var status: Double
    var statusText: String
    var data: Any?
}
