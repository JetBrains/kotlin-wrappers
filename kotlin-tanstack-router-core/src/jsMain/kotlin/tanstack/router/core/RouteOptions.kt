package tanstack.router.core

import js.objects.JsPlainObject
import js.promise.PromiseResult

@JsPlainObject
external interface RouteOptions<TParentRoute : AnyRoute> :
    UpdatableRouteOptions {
    // BaseRouteOptions
    val getParentRoute: () -> TParentRoute

    // RoutePathOptions
    val path: RoutePath?
    val id: RouteId?

    // ParamsOptions
    val params: ParamsOptions?

    @JsPlainObject
    interface ParamsOptions {
        val parse: ((rawParams: String) -> Params)?
        val stringify: ((params: Params) -> String)?
    }

    // FilebaseRouteOptionsInterface
    val validateSearch: ((rawSearch: Search) -> Search)?
    val shouldReload: ((context: LoaderFnContext) -> Boolean?)? /* | Boolean */
    val context: ((options: RouteContextOptions) -> Context?)?
    val ssr: ((options: SsrContextOptions) -> PromiseResult<SSROption?>)?
    val beforeLoad: ((options: BeforeLoadContextOptions) -> PromiseResult<Context?>?)?
    val loaderDeps: ((options: FullSearchSchemaOption) -> LoaderDeps?)?
    val remountDeps: ((options: RemountDepsOptions) -> Unit)?
    val loader: ((options: LoaderFnContext) -> PromiseResult<Any? /* LoaderData */>?)?
}
