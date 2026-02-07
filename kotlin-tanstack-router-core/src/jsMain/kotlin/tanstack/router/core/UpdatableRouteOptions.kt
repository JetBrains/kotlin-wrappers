package tanstack.router.core

import js.array.ReadonlyArray
import js.errors.JsError
import js.errors.JsErrorLike
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UpdatableRouteOptions {
    val caseSensitive: Boolean?
    val wrapInSuspense: Boolean?
    val pendingMs: Int?
    val pendingMinMs: Int?
    val staleTime: Int?
    val gcTime: Int?
    val preload: Boolean?
    val preloadStaleTime: Int?
    val preloadGcTime: Int?
    val search: SearchOptions?

    @JsPlainObject
    interface SearchOptions {
        val middlewares: ReadonlyArray<SearchMiddleware>?
    }

    // val postSearchFilters?: Array<SearchFilter<ResolveFullSearchSchema<TParentRoute, TSearchValidator>>>
    val onCatch: ((error: JsError) -> Unit)?
    val onError: ((error: JsErrorLike) -> Unit)?
    val onEnter: ((match: RouteMatch) -> Unit)?
    val onStay: ((match: RouteMatch) -> Unit)?
    val onLeave: ((match: RouteMatch) -> Unit)?

    /*
    val headers?: (ctx: AssetFnContextOptions<TRouteId, TFullPath, TParentRoute, TParams, TSearchValidator, TLoaderFn, TRouterContext, TRouteContextFn, TBeforeLoadFn, TLoaderDeps>) => Awaitable<Record<string, string>>
    val head?: (ctx: AssetFnContextOptions<TRouteId, TFullPath, TParentRoute, TParams, TSearchValidator, TLoaderFn, TRouterContext, TRouteContextFn, TBeforeLoadFn, TLoaderDeps>) => Awaitable<{
        links?: AnyRouteMatch['links']
        scripts?: AnyRouteMatch['headScripts']
        meta?: AnyRouteMatch['meta']
        styles?: AnyRouteMatch['styles']
    }>
    val scripts?: (ctx: AssetFnContextOptions<TRouteId, TFullPath, TParentRoute, TParams, TSearchValidator, TLoaderFn, TRouterContext, TRouteContextFn, TBeforeLoadFn, TLoaderDeps>) => Awaitable<AnyRouteMatch['scripts']>
    val codeSplitGroupings?: Array<Array<'loader' | 'component' | 'pendingComponent' | 'notFoundComponent' | 'errorComponent'>>
    */
}
