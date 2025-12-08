// Automatically generated - do not modify!

package web.navigation

import js.objects.JsPlainObject
import js.promise.Promise

@JsPlainObject
external interface NavigationResult {
    var committed: Promise<NavigationHistoryEntry>?
    var finished: Promise<NavigationHistoryEntry>?
}
