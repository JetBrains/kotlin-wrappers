package remix.run.router


sealed external interface BlockerBlocked {
    var state: String /* "blocked" */
    fun reset(): Unit
    fun proceed(): Unit
    var location: Location<*>
}
