package react.router.dom


sealed external interface ViewTransition {
    var finished: Promise<Unit>
    var ready: Promise<Unit>
    var updateCallbackDone: Promise<Unit>
    fun skipTransition(): Unit
}
