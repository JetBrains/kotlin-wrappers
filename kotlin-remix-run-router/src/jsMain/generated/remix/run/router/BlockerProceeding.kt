@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


external interface BlockerProceeding {
    var state: String
    var reset: Nothing?
    var proceed: Nothing?
    var location: Location
}

