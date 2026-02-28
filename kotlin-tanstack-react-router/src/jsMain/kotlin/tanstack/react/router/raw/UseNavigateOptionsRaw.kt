package tanstack.react.router.raw

import kotlinx.js.JsPlainObject
import tanstack.router.core.RoutePath

@JsPlainObject
internal /* raw */
external interface UseNavigateOptionsRaw {
    val from: RoutePath
}
