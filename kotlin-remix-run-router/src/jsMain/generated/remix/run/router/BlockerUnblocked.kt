@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


sealed external interface BlockerUnblocked {
    var state: String
    var reset: Nothing?
    var proceed: Nothing?
    var location: Nothing?
}
