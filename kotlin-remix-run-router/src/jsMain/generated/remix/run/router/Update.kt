@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A change to the current location.
 */

sealed external interface Update {
    /**
     * The action that triggered the change.
     */
    var action: Action

    /**
     * The new location.
     */
    var location: Location

    /**
     * The delta between this location and the former location in the history stack
     */
    var delta: Double?
}
