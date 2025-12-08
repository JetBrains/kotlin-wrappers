package web.navigation

import js.objects.JsPlainObject

@JsPlainObject
external interface NavigationInterceptOptions {
    var handler: NavigationInterceptHandler?
    var focusReset: NavigationFocusReset?
    var scroll: NavigationScrollBehavior?
}
