package web.navigation

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface NavigationReloadOptions :
    NavigationOptions {
    var state: JsAny?
}
