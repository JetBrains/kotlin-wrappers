package remix.run.router


sealed external interface BlockerUnblocked {
    var state: String /* "unblocked" */
    var reset: Nothing?
    var proceed: Nothing?
    var location: Nothing?
}
