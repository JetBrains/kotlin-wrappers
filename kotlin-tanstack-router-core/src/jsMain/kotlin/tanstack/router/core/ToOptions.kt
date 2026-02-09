package tanstack.router.core

import js.reflect.JsExternalInheritorsOnly
import kotlinx.js.JsPlainObject
import tanstack.history.HistoryState

@JsExternalInheritorsOnly
@JsPlainObject
external interface ToOptions {
    var from: RoutePath?
    var to: RoutePath?
    var params: Params? // Updater
    var search: Search? // Updater
    var hash: String? // Updater
    var state: HistoryState? // Updater
}
