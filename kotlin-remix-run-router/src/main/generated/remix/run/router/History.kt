@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A history is an interface to the navigation stack. The history serves as the
 * source of truth for the current location, as well as provides a set of
 * methods that may be used to change it.
 *
 * It is similar to the DOM's `window.history` object, but with a smaller, more
 * focused API.
 */

external interface History {
    /**
     * The last action that modified the current location. This will always be
     * Action.Pop when a history instance is first created. This value is mutable.
     */
    val action: Action

    /**
     * The current location. This value is mutable.
     */
    val location: Location

    /**
     * Returns a valid href for the given `to` value that may be used as
     * the value of an <a href> attribute.
     *
     * @param to - The destination URL
     */
    fun createHref(to: To): String

    /**
     * Encode a location the same way window.history would do (no-op for memory
     * history) so we ensure our PUSH/REPLAC e navigations for data routers
     * behave the same as POP
     *
     * @param location The incoming location from router.navigate()
     */
    fun encodeLocation(location: Location): Location

    /**
     * Pushes a new location onto the history stack, increasing its length by one.
     * If there were any entries in the stack after the current one, they are
     * lost.
     *
     * @param to - The new URL
     * @param state - Data to associate with the new location
     */
    fun push(to: To, state: Any? = definedExternally): Unit

    /**
     * Replaces the current location in the history stack with a new one.  The
     * location that was replaced will no longer be available.
     *
     * @param to - The new URL
     * @param state - Data to associate with the new location
     */
    fun replace(to: To, state: Any? = definedExternally): Unit

    /**
     * Navigates `n` entries backward/forward in the history stack relative to the
     * current index. For example, a "back" navigation would use go(-1).
     *
     * @param delta - The delta in the stack index
     */
    fun go(delta: Double): Unit

    /**
     * Sets up a listener that will be called whenever the current location
     * changes.
     *
     * @param listener - A function that will be called when the location changes
     * @returns unlisten - A function that may be used to stop listening
     */
    fun listen(listener: Listener): () -> Unit
}

