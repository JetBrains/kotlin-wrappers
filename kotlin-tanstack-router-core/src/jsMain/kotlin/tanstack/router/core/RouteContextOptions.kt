package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RouteContextOptions :
    ContextOptions {
    val deps: LoaderDeps?
    val context: Context?
}
