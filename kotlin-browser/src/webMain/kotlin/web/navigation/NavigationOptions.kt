package web.navigation

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface NavigationOptions {
    var info: JsAny?
}
