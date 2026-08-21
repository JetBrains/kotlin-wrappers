package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UpdatableStaticRouteOption {
    val staticData: Any? /* StaticDataRouteOption? */
}