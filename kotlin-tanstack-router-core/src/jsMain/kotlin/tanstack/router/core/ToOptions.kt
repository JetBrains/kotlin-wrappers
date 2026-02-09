package tanstack.router.core

import js.reflect.JsExternalInheritorsOnly
import tanstack.history.HistoryState

@JsExternalInheritorsOnly
external interface ToOptions {
    var from: RoutePath?
    var to: RoutePath?
    var params: Params? // Updater
    var search: Search? // Updater
    var hash: String? // Updater
    var state: HistoryState? // Updater
}
