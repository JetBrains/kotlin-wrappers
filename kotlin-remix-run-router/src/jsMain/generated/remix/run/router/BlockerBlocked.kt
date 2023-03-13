@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


sealed external interface BlockerBlocked {
    var state: String
    fun reset(): Unit
    fun proceed(): Unit
    var location: Location
}
