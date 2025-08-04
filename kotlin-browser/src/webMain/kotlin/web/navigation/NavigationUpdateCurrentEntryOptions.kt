package web.navigation

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface NavigationUpdateCurrentEntryOptions {
    var state: JsAny?
}
