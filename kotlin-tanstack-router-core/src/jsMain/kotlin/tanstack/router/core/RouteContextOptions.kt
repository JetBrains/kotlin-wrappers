package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface RouteContextOptions :
    ContextOptions {
    val deps: LoaderDeps?
    val context: Context?
}
