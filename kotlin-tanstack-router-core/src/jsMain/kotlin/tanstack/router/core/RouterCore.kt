@file:JsModule("@tanstack/router-core")

package tanstack.router.core

import js.core.Void
import js.objects.ReadonlyRecord
import js.promise.Promise
import tanstack.history.RouterHistory

open external class RouterCore
private constructor() {
    val tempLocationKey: String?
    val resetNextScroll: Boolean

    // shouldViewTransition?: boolean | ViewTransitionOptions
    val isViewTransitionTypesSupported: Boolean?

    // subscribers: Set<RouterListener<RouterEvent>>
    // viewTransitionPromise?: ControlledPromise<true>
    val isScrollRestoring: Boolean
    val isScrollRestorationSetup: Boolean
    val options: RouterOptions<*>
    val history: RouterHistory
    val rewrite: LocationRewrite?
    val origin: String?
    val latestLocation: ParsedLocation
    val pendingBuiltLocation: ParsedLocation?
    val basepath: String?

    // routeTree: TRouteTree
    // routesById: RoutesById<TRouteTree>
    // routesByPath: RoutesByPath<TRouteTree>
    // processedTree: ProcessedTree<TRouteTree, any, any>
    // resolvePathCache: LRUCache<string, string>
    val isServer: Boolean
    val pathParamsDecoder: ((encoded: String) -> String)?
    val protocolAllowlist: Set<String>

    // startTransition: StartTransitionFn
    fun isShell(): Boolean
    fun isPrerendering(): Boolean

    // update: UpdateFn
    // get state(): RouterState<TRouteTree>
    fun updateLatestLocation()
    // buildRouteTree: () => ProcessRouteTreeResult<TRouteTree>
    // setRoutes(options: ProcessRouteTreeResult<TRouteTree>): void
    /**
     * Subscribe to router lifecycle events like `onBeforeNavigate`, `onLoad`,
     * `onResolved`, etc. Returns an unsubscribe function.
     *
     * @link https://tanstack.com/router/latest/docs/framework/react/api/router/RouterEventsType
     */
    // subscribe: SubscribeFn
    // emit: EmitFn
    /**
     * Parse a HistoryLocation into a strongly-typed ParsedLocation using the
     * current router options, rewrite rules and search parser/stringifier.
     */
    // parseLocation: ParseLocationFn<TRouteTree>
    /** Resolve a path against the router basepath and trailing-slash policy. */
    fun resolvePathWithBase(from: String, path: String): String
    val looseRoutesById: ReadonlyRecord<String, AnyRoute>

    // matchRoutes: MatchRoutesFn
    // getMatchedRoutes: GetMatchRoutesFn
    fun cancelMatch(id: String)
    fun cancelMatches()

    /**
     * Build the next ParsedLocation from navigation options without committing.
     * Resolves `to`/`from`, params/search/hash/state, applies search validation
     * and middlewares, and returns a stable, stringified location object.
     *
     * @link https://tanstack.com/router/latest/docs/framework/react/api/router/RouterType#buildlocation-method
     */
    val buildLocation: BuildLocationFn
    // commitLocationPromise: undefined | ControlledPromise<void>
    /**
     * Commit a previously built location to history (push/replace), optionally
     * using view transitions and scroll restoration options.
     */
    // commitLocation: CommitLocationFn
    /** Convenience helper: build a location from options, then commit it. */
    // buildAndCommitLocation: (options: BuildNextOptions & CommitLocationOptions) => Promise<void>
    /**
     * Imperatively navigate using standard `NavigateOptions`. When `reloadDocument`
     * or an absolute `href` is provided, performs a full document navigation.
     * Otherwise, builds and commits a client-side location.
     *
     * @link https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType
     */
    // navigate: NavigateFn
    val latestLoadPromise: Promise<Void>?
    fun beforeLoad()
    // load: LoadFn
    // startViewTransition: (fn: () => Promise<void>) => void
    // updateMatch: UpdateMatchFn
    // getMatch: GetMatchFn
    /**
     * Invalidate the current matches and optionally force them back into a pending state.
     *
     * - Marks all matches that pass the optional `filter` as `invalid: true`.
     * - If `forcePending` is true, or a match is currently in `'error'` or `'notFound'` status,
     *   its status is reset to `'pending'` and its `error` cleared so that the loader is re-run
     *   on the next `load()` call (eg. after HMR or a manual invalidation).
     */
    // invalidate: InvalidateFn<RouterCore>
    fun getParsedLocationHref(location: ParsedLocation): String

    // resolveRedirect: (redirect: AnyRedirect) => AnyRedirect
    // clearCache: ClearCacheFn<this>
    fun clearExpiredCache()

    // loadRouteChunk: typeof loadRouteChunk
    // preloadRoute: PreloadRouteFn
    // matchRoute: MatchRouteFn
    // ssr?: {
    //     manifest: Manifest | undefined
    // }
    // serverSsr?: ServerSsr
    fun hasNotFoundMatch(): Boolean
}
