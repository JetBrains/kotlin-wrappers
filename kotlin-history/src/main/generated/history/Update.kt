// Automatically generated - do not modify!

package history

/**
 * A change to the current location.
 */
external interface Update {
    /**
     * The action that triggered the change.
     */
    var action: Action

    /**
     * The new location.
     */
    var location: history.Location
}
