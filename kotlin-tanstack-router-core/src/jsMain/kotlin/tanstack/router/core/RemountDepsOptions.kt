package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RemountDepsOptions {
    val routeId: RouteId
    val search: Search
    val params: Params
    val loaderDeps: LoaderDeps?
}
