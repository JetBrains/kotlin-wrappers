package tanstack.router.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import tanstack.history.RouterHistory
import web.dom.Element
import web.scroll.ScrollBehavior

@JsPlainObject
external interface RouterOptions<TRoute : Any> {
    /**
     * The history object that will be used to manage the browser history.
     *
     * If not provided, a new createBrowserHistory instance will be created and used.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#history-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/history-types)
     */
    val history: RouterHistory?

    /**
     * A function that will be used to stringify search params when generating links.
     *
     * `default` - defaultStringifySearch
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#stringifysearch-method)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/custom-search-param-serialization)
     */
    // stringifySearch?: SearchSerializer;

    /**
     * A function that will be used to parse search params when parsing the current location.
     *
     * `default` - defaultParseSearch
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#parsesearch-method)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/custom-search-param-serialization)
     */
    // parseSearch?: SearchParser;

    /**
     * If `false`, routes will not be preloaded by default in any way.
     *
     * If `'intent'`, routes will be preloaded by default when the user hovers over a link or a `touchstart` event is detected on a `<Link>`.
     *
     * If `'viewport'`, routes will be preloaded by default when they are within the viewport.
     *
     * `default` - false
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpreload-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/preloading)
     */
    // defaultPreload?: false | 'intent' | 'viewport' | 'render';

    /**
     * The delay in milliseconds that a route must be hovered over or touched before it is preloaded.
     *
     * `default` - 50
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpreloaddelay-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/preloading#preload-delay)
     */
    val defaultPreloadDelay: Int?

    /**
     * The default `preloadIntentProximity` a route should use if no preloadIntentProximity is provided.
     *
     * `default` - 0
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpreloadintentproximity-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/preloading#preload-intent-proximity)
     */
    val defaultPreloadIntentProximity: Int?

    /**
     * The default `pendingMs` a route should use if no pendingMs is provided.
     *
     * `default` - 1000
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpendingms-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#avoiding-pending-component-flash)
     */
    val defaultPendingMs: Int?

    /**
     * The default `pendingMinMs` a route should use if no pendingMinMs is provided.
     *
     * `default` - 500
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpendingminms-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#avoiding-pending-component-flash)
     */
    val defaultPendingMinMs: Int?

    /**
     * The default `staleTime` a route should use if no staleTime is provided. This is the time in milliseconds that a route will be considered fresh.
     *
     * `default` - 0
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultstaletime-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#key-options)
     */
    val defaultStaleTime: Int?

    /**
     * The default `preloadStaleTime` a route should use if no preloadStaleTime is provided.
     *
     * `default` - 30_000 `(30 seconds)`
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpreloadstaletime-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/preloading)
     */
    val defaultPreloadStaleTime: Int?

    /**
     * The default `defaultPreloadGcTime` a route should use if no preloadGcTime is provided.
     *
     * `default` - 1_800_000 `(30 minutes)`
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpreloadgctime-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/preloading)
     */
    val defaultPreloadGcTime: Int?

    /**
     * If `true`, route navigations will called using `document.startViewTransition()`.
     *
     * If the browser does not support this api, this option will be ignored.
     *
     * See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Document/startViewTransition) for more information on how this function works.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultviewtransition-property)
     */
    // defaultViewTransition?: boolean | ViewTransitionOptions;

    /**
     * The default `hashScrollIntoView` a route should use if no hashScrollIntoView is provided while navigating
     *
     * See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView) for more information on `ScrollIntoViewOptions`.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaulthashscrollintoview-property)
     */
    // defaultHashScrollIntoView?: boolean | ScrollIntoViewOptions;

    /**
     * `default` - 'fuzzy'
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#notfoundmode-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/not-found-errors#the-notfoundmode-option)
     */
    // notFoundMode?: 'root' | 'fuzzy';

    /**
     * The default `gcTime` a route should use if no gcTime is provided.
     *
     * `default` - 1_800_000 `(30 minutes)`
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultgctime-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#key-options)
     */
    val defaultGcTime: Int?

    /**
     * If `true`, all routes will be matched as case-sensitive.
     *
     * `default` - false
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#casesensitive-property)
     */
    val caseSensitive: Boolean?

    /**
     *
     * The route tree that will be used to configure the router instance.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#routetree-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/routing/route-trees)
     */
    val routeTree: TRoute

    /**
     * The basepath for then entire router. This is useful for mounting a router instance at a subpath.
     * ```
     * `default` - '/'
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#basepath-property)
     */
    val basepath: String?

    /**
     * The root context that will be provided to all routes in the route tree.
     *
     * This can be used to provide a context to all routes in the tree without having to provide it to each route individually.
     *
     * Optional or required if the root route was created with [`createRootRouteWithContext()`](https://tanstack.com/router/latest/docs/framework/react/api/router/createRootRouteWithContextFunction).
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#context-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/router-context)
     */
    // context?: InferRouterContext<TRouteTree>;

    val additionalContext: Any?

    /**
     * A function that will be called when the router is dehydrated.
     *
     * The return value of this function will be serialized and stored in the router's dehydrated state.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#dehydrate-method)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/external-data-loading#critical-dehydrationhydration)
     */
    // dehydrate?: () => Constrain<TDehydrated, ValidateSerializableInput<Register, TDehydrated>>;

    /**
     * A function that will be called when the router is hydrated.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#hydrate-method)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/external-data-loading#critical-dehydrationhydration)
     */
    // hydrate?: (dehydrated: TDehydrated) => Awaitable<void>;

    /**
     * An array of route masks that will be used to mask routes in the route tree.
     *
     * Route masking is when you display a route at a different path than the one it is configured to match, like a modal popup that when shared will unmask to the modal's content instead of the modal's context.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#routemasks-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/route-masking)
     */
    // routeMasks?: Array<RouteMask<TRouteTree>>;

    /**
     * If `true`, route masks will, by default, be removed when the page is reloaded.
     *
     * This can be overridden on a per-mask basis by setting the `unmaskOnReload` option on the mask, or on a per-navigation basis by setting the `unmaskOnReload` option in the `Navigate` options.
     *
     * `default` - false
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#unmaskonreload-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/route-masking#unmasking-on-page-reload)
     */
    val unmaskOnReload: Boolean?

    /**
     * Configures how trailing slashes are treated.
     *
     * - `'always'` will add a trailing slash if not present
     * - `'never'` will remove the trailing slash if present
     * - `'preserve'` will not modify the trailing slash.
     *
     * `default` - 'never'
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#trailingslash-property)
     */
    // val trailingSlash: TTrailingSlashOption?

    /**
     * While usually automatic, sometimes it can be useful to force the router into a server-side state, e.g. when using the router in a non-browser environment that has access to a global.document object.
     *
     * `default` - typeof document !== 'undefined'
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#isserver-property)
     */
    val isServer: Boolean?

    /**
     * `default` - false
     */
    val isShell: Boolean?

    /**
     * `default` - false
     */
    val isPrerendering: Boolean?

    /**
     * The default `ssr` a route should use if no `ssr` is provided.
     *
     * `default` - true
     */
    val defaultSsr: Any? /* SSROption? */

    val search: Search?

    @JsPlainObject
    interface Search {
        /**
         * Configures how unknown search params (= not returned by any `validateSearch`) are treated.
         *
         * `default` - false
         * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#search.strict-property)
         */
        val strict: Boolean?
    }

    /**
     * Configures whether structural sharing is enabled by default for fine-grained selectors.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultstructuralsharing-property)
     */
    // defaultStructuralSharing?: TDefaultStructuralSharingOption;

    /**
     * Configures which URI characters are allowed in path params that would ordinarily be escaped by encodeURIComponent.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#pathparamsallowedcharacters-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/path-params#allowed-characters)
     */
    // pathParamsAllowedCharacters?: Array<';' | ':' | '@' | '&' | '=' | '+' | '$' | ','>;

    // defaultRemountDeps?: DefaultRemountDepsFn<TRouteTree>;

    /**
     * If `true`, scroll restoration will be enabled
     *
     * `default` - false
     */
    /*
    scrollRestoration?: boolean | ((opts:
    {
        location: ParsedLocation;
    }) => boolean);
    */

    /**
     * A function that will be called to get the key for the scroll restoration cache.
     *
     * `default` - (location) => location.href
     */
    // getScrollRestorationKey?: (location: ParsedLocation) => string;

    /**
     * The default behavior for scroll restoration.
     *
     * `default` - 'auto'
     */
    val scrollRestorationBehavior: ScrollBehavior?

    /**
     * An array of selectors that will be used to scroll to the top of the page in addition to `window`
     *
     * `default` - ['window']
     */
    val scrollToTopSelectors: ReadonlyArray<() -> Element?>?

    /**
     * When `true`, disables the global catch boundary that normally wraps all route matches.
     * This allows unhandled errors to bubble up to top-level error handlers in the browser.
     *
     * Useful for testing tools (like Storybook Test Runner), error reporting services,
     * and debugging scenarios where you want errors to reach the browser's global error handlers.
     *
     * `default` - false
     */
    val disableGlobalCatchBoundary: Boolean?

    // val serializationAdapters: ReadonlyArray<AnySerializationAdapter>?

    /**
     * Configures how the router will rewrite the location between the actual href and the internal href of the router.
     *
     * `default` - undefined
     * @description You can provide a custom rewrite pair (in/out).
     * This is useful for shifting data from the origin to the path (for things like subdomain routing), or other advanced use cases.
     */
    // val rewrite: LocationRewrite?

    val origin: String?

    val ssr: SSR?

    @JsPlainObject
    interface SSR {
        val nonce: String?
    }
}
