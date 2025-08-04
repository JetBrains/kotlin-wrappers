package web.navigation

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface NavigationNavigateOptions :
    NavigationOptions {
    var state: JsAny?
    var history: NavigationHistoryBehavior?
}
