package js.observable

external interface Subscription {
    /**
     * Cancels the subscription
     */
    fun unsubscribe()

    /**
     * A boolean value indicating whether the subscription is closed
     */
    val closed: Boolean
}
