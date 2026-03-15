package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RouteLoaderObject :
    RouteLoaderEntry {
    val handler: RouteLoaderFn
    val staleReloadMode: LoaderStaleReloadMode?
}
