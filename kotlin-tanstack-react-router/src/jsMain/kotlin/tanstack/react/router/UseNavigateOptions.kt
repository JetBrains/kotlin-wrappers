package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.RoutePath

@JsPlainObject
internal external interface UseNavigateOptions {
    val from: RoutePath
}
