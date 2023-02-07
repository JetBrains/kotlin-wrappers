@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import history.Action as HistoryAction

/**
 * State maintained internally by the router.  During a navigation, all states
 * reflect the the "old" location unless otherwise noted.
 */

external interface RouterState {
    /**
     * The action of the most recent navigation
     */
    var historyAction: HistoryAction

    /**
     * The current location reflected by the router
     */
    var location: Location

    /**
     * The current set of route matches
     */
    var matches: js.core.ReadonlyArray<AgnosticDataRouteMatch>

    /**
     * Tracks whether we've completed our initial data load
     */
    var initialized: Boolean

    /**
     * Current scroll position we should start at for a new view
     *  - number -> scroll position to restore to
     *  - false -> do not restore scroll at all (used during submissions)
     *  - null -> don't have a saved position, scroll to hash or top of page
     */
    var restoreScrollPosition: (Any /* number | false | null */)?

    /**
     * Indicate whether this navigation should skip resetting the scroll position
     * if we are unable to restore the scroll position
     */
    var preventScrollReset: Boolean

    /**
     * Tracks the state of the current navigation
     */
    var navigation: Navigation

    /**
     * Tracks any in-progress revalidations
     */
    var revalidation: RevalidationState

    /**
     * Data from the loaders for the current matches
     */
    var loaderData: RouteData

    /**
     * Data from the action for the current matches
     */
    var actionData: RouteData?

    /**
     * Errors caught from loaders for the current matches
     */
    var errors: RouteData?

    /**
     * Map of current fetchers
     */
    var fetchers: js.collections.ReadonlyMap<String, Fetcher<*>>

    /**
     * Map of current blockers
     */
    var blockers: js.collections.ReadonlyMap<String, Blocker>
}

