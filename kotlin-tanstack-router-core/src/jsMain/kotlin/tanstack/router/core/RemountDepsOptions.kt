package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface RemountDepsOptions {
    val routeId: RouteId
    val search: Search
    val params: Params
    val loaderDeps: LoaderDeps?
}
