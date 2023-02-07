// Automatically generated - do not modify!

package history

/**
 * A change to the current location that was blocked. May be retried
 * after obtaining user confirmation.
 */
external interface Transition : Update {
    /**
     * Retries the update to the current location.
     */
    fun retry()
}
