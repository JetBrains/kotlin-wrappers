// Automatically generated - do not modify!

package tanstack.history

external interface CreateHistoryOpts {
    var getLocation: () -> HistoryLocation
    var getLength: () -> Double
    var pushState: (path: String, state: Any?) -> Unit
    var replaceState: (path: String, state: Any?) -> Unit
    var go: (n: Double) -> Unit
    var back: (ignoreBlocker: Boolean) -> Unit
    var forward: (ignoreBlocker: Boolean) -> Unit
    var createHref: (path: String) -> String
    var flush: (() -> Unit)?
    var destroy: (() -> Unit)?
    var onBlocked: (() -> Unit)?
    var getBlockers: (() -> Array<NavigationBlocker>)?
    var setBlockers: ((blockers: Array<NavigationBlocker>) -> Unit)?
    var notifyOnIndexChange: Boolean?
}
