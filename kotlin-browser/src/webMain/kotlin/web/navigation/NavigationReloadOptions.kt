package web.navigation

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface NavigationReloadOptions :
    NavigationOptions {
    var state: JsAny?
}
