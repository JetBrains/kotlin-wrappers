// Automatically generated - do not modify!

package tanstack.history

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface CreateHistoryOpts {
    var getLocation: () -> HistoryLocation
    var getLength: () -> Int
    var pushState: (path: String, state: Any?) -> Unit
    var replaceState: (path: String, state: Any?) -> Unit
    var go: (n: Int) -> Unit
    var back: (ignoreBlocker: Boolean) -> Unit
    var forward: (ignoreBlocker: Boolean) -> Unit
    var createHref: (path: String) -> String
    var flush: (() -> Unit)?
    var destroy: (() -> Unit)?
    var onBlocked: (() -> Unit)?
    var getBlockers: (() -> ReadonlyArray<NavigationBlocker>)?
    var setBlockers: ((blockers: ReadonlyArray<NavigationBlocker>) -> Unit)?
    var notifyOnIndexChange: Boolean?
}
