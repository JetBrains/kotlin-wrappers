// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

external class Cookies : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/cookies
    /**
     * Emitted when a cookie is changed because it was added, edited, removed, or
     * expired.
     */

    /**
     * A promise which resolves when the cookie store has been flushed
     *
     * Writes any unwritten cookies data to disk
     *
     * Cookies written by any method will not be written to disk immediately, but will
     * be written every 30 seconds or 512 operations
     *
     * Calling this method can cause the cookie to be written to disk immediately.
     */
    fun flushStore(): js.promise.Promise<js.core.Void>

    /**
     * A promise which resolves an array of cookie objects.
     *
     * Sends a request to get all cookies matching `filter`, and resolves a promise
     * with the response.
     */
    fun get(filter: CookiesGetFilter): js.promise.Promise<js.array.ReadonlyArray<Cookie>>

    /**
     * A promise which resolves when the cookie has been removed
     *
     * Removes the cookies matching `url` and `name`
     */
    fun remove(
        url: String,
        name: String,
    ): js.promise.Promise<js.core.Void>

    /**
     * A promise which resolves when the cookie has been set
     *
     * Sets a cookie with `details`.
     */
    fun set(details: CookiesSetDetails): js.promise.Promise<js.core.Void>

    @web.events.JsEvent("changed")
    val changedEvent:
            node.events.EventInstance<js.array.Tuple4<Event<*>, Cookie, (CookiesAddListenerListenerCause), Boolean>>
}
