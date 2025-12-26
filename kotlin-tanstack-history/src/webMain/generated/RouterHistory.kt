// Automatically generated - do not modify!

package tanstack.history

external interface RouterHistory {
    var location: HistoryLocation
    var length: Double
    var subscribers: Set<(opts: SubscriberArgs) -> Unit>
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
    var go: (index: Double, navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
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
