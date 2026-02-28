// Automatically generated - do not modify!

package tanstack.history

@kotlinx.js.JsPlainObject
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
    var getBlockers: (() -> js.array.ReadonlyArray<NavigationBlocker>)?
    var setBlockers: ((blockers: js.array.ReadonlyArray<NavigationBlocker>) -> Unit)?
    var notifyOnIndexChange: Boolean?
}
