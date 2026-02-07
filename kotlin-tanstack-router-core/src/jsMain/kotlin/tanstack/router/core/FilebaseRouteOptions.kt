package tanstack.router.core

import js.promise.PromiseResult
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface FilebaseRouteOptions {
    val validateSearch: ((rawSearch: Search) -> Search)?
    val shouldReload: ((context: LoaderFnContext) -> Boolean?)? /* | Boolean */
    val context: ((options: RouteContextOptions) -> Context?)?
    val ssr: ((options: SsrContextOptions) -> PromiseResult<SSROption?>)?
    val beforeLoad: ((options: BeforeLoadContextOptions) -> PromiseResult<Context?>?)?
    val loaderDeps: ((options: FullSearchSchemaOption) -> LoaderDeps?)?
    val remountDeps: ((options: RemountDepsOptions) -> Unit)?
    val loader: ((options: LoaderFnContext) -> PromiseResult<LoaderData?>)?
}
