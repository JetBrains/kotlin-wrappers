@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import js.core.Record
import web.abort.AbortController
import web.url.URL
import kotlin.js.Promise

/**
 * A Router instance manages all navigation and data loading/mutations
 */

external interface Router {
    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Return the basename for the router
     */
    /* get basename(): RouterInit["basename"]; */
    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Return the current state of the router
     */
    /* get state(): RouterState; */
    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Return the routes for this router instance
     */
    /* get routes(): AgnosticDataRouteObject[]; */
    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Initialize the router, including adding history listeners and kicking off
     * initial data fetches.  Returns a function to cleanup listeners and abort
     * any in-progress loads
     */
    fun initialize(): Router

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Subscribe to router.state updates
     *
     * @param fn function to call with the new state
     */
    fun subscribe(fn: RouterSubscriber): () -> Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Enable scroll restoration behavior in the router
     *
     * @param savedScrollPositions Object that will manage positions, in case
     *                             it's being restored from sessionStorage
     * @param getScrollPosition    Function to get the active Y scroll position
     * @param getKey               Function to get the key to use for restoration
     */
    fun enableScrollRestoration(savedScrollPositions: Record<String, Double>, getScrollPosition: GetScrollPositionFunction, getKey: GetScrollRestorationKeyFunction = definedExternally): () -> Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Navigate forward/backward in the history stack
     * @param to Delta to move in the history stack
     */
    fun navigate(to: Double): Promise<Unit>

    /**
     * Navigate to the given path
     * @param to Path to navigate to
     * @param opts Navigation options (method, submission, etc.)
     */
    fun navigate(to: To, opts: RouterNavigateOptions = definedExternally): Promise<Unit>

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Trigger a fetcher load/submission
     *
     * @param key     Fetcher key
     * @param routeId Route that owns the fetcher
     * @param href    href to fetch
     * @param opts    Fetcher options, (method, submission, etc.)
     */
    fun fetch(key: String, routeId: String, href: String, opts: RouterNavigateOptions = definedExternally): Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Trigger a revalidation of all current route loaders and fetcher loads
     */
    fun revalidate(): Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Utility function to create an href for the given location
     * @param location
     */
    fun createHref(location: Location): String

    fun createHref(location: URL): String

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Utility function to URL encode a destination path according to the internal
     * history implementation
     * @param to
     */
    fun encodeLocation(to: To): Path

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Get/create a fetcher for the given key
     * @param key
     */
    fun <TData /* default is Any? */> getFetcher(key: String = definedExternally): Fetcher<TData>

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Delete the fetcher for a given key
     * @param key
     */
    fun deleteFetcher(key: String = definedExternally): Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Cleanup listeners and abort any in-progress loads
     */
    fun dispose(): Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Get a navigation blocker
     * @param key The identifier for the blocker
     * @param fn The blocker function implementation
     */
    fun getBlocker(key: String, fn: BlockerFunction): Blocker

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Delete a navigation blocker
     * @param key The identifier for the blocker
     */
    fun deleteBlocker(key: String): Unit

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Internal fetch AbortControllers accessed by unit tests
     */
    var _internalFetchControllers: js.collections.JsMap<String, AbortController>

    /**
     * @internal
     * PRIVATE - DO NOT USE
     *
     * Internal pending DeferredData instances accessed by unit tests
     */
    var _internalActiveDeferreds: js.collections.JsMap<String, DeferredData>
}

