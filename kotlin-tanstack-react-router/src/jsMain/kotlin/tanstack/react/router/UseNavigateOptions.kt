package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.RoutePath

@JsPlainObject
internal external interface UseNavigateOptions {
    val from: RoutePath
}
