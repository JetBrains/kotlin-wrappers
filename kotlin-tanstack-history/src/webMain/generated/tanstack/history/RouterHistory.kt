// Automatically generated - do not modify!

package tanstack.history

import js.collections.JsSet

external interface RouterHistory {
    var location: HistoryLocation
    var length: Int
    var subscribers: JsSet<(opts: SubscriberArgs) -> Unit>
    var subscribe: (cb: (opts: SubscriberArgs) -> Unit) -> () -> Unit
    var push: (
        path: String,
        state: Any?, /* use undefined for default */
        navigateOpts: NavigateOptions?, // use undefined for default
    ) -> Unit
    var replace: (
        path: String,
        state: Any?, /* use undefined for default */
        navigateOpts: NavigateOptions?, // use undefined for default
    ) -> Unit
    var go: (index: Int, navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
    var back: (navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
    var forward: (navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
    var canGoBack: () -> Boolean
    var createHref: (href: String) -> String
    var block: (blocker: NavigationBlocker) -> () -> Unit
    var flush: () -> Unit
    var destroy: () -> Unit
    var notify: (action: SubscriberHistoryAction) -> Unit
    var _ignoreSubscribers: Boolean?
}
