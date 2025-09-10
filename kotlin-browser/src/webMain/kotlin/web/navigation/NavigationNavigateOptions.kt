package web.navigation

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface NavigationNavigateOptions :
    NavigationOptions {
    var state: JsAny?
    var history: NavigationHistoryBehavior?
}
