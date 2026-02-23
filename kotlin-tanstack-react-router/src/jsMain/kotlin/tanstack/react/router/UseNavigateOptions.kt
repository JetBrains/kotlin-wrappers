package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.RoutePath

@JsPlainObject
internal /* raw */
external interface UseNavigateOptions {
    val from: RoutePath
}
