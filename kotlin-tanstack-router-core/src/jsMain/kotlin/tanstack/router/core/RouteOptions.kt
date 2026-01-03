package tanstack.router.core

import js.objects.JsPlainObject
import js.promise.PromiseResult

@JsPlainObject
external interface RouteOptions<TParentRoute : AnyRoute> {
    // BaseRouteOptions
    val getParentRoute: () -> TParentRoute

    // RoutePathOptions
    val path: RoutePath?
    val id: RouteId?

    // ParamsOptions
    val params: Params?

    @JsPlainObject
    interface Params {
        val parse: ((rawParams: String) -> Params)?
        val stringify: ((params: Params) -> String)?
    }

    // FilebaseRouteOptionsInterface
    val validateSearch: ((rawSearch: Search) -> Search)?
    val shouldReload: ((match: LoaderFnContext) -> Boolean?)? /* | Boolean */
    val context: ((ctx: RouteContextOptions) -> Context?)?

    // val ssr: ((ctx: SsrContextOptions) -> Awaitable<SSROption?>)?

    val beforeLoad: ((ctx: BeforeLoadContextOptions) -> PromiseResult<Context?>?)?
    val loaderDeps: ((opts: FullSearchSchemaOption) -> LoaderDeps?)?

    // val remountDeps: ((opt: RemountDepsOptions) -> Any?)?
    val loader: ((ctx: LoaderFnContext) -> PromiseResult<Any? /* LoaderData */>?)?
}
