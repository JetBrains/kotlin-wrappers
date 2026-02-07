package tanstack.router.core

import js.promise.Promise
import kotlinx.js.JsPlainObject
import web.abort.AbortController

@JsPlainObject
external interface LoaderFnContext {
    val abortController: AbortController
    val preload: Boolean
    val params: Params
    val deps: LoaderDeps
    val context: Context?
    val location: ParsedLocation
    val parentMatchPromise: Promise<Any /* MakeRouteMatchFromRoute */>?
    val cause: Cause
    val route: AnyRoute
}
