@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

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
    var location: Location
}

