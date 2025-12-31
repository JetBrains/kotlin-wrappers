// Automatically generated - do not modify!

package tanstack.history

import js.collections.JsSet

external interface RouterHistory {
    val location: HistoryLocation
    val length: Int
    val subscribers: JsSet<(opts: SubscriberArgs) -> Unit>
    fun subscribe(cb: (opts: SubscriberArgs) -> Unit): () -> Unit
    fun push(
        path: String,
        state: Any? = definedExternally,
        navigateOpts: NavigateOptions? = definedExternally,
    )

    fun replace(
        path: String,
        state: Any? = definedExternally,
        navigateOpts: NavigateOptions? = definedExternally,
    )

    fun go(index: Int, navigateOpts: NavigateOptions? = definedExternally)
    fun back(navigateOpts: NavigateOptions? = definedExternally)
    fun forward(navigateOpts: NavigateOptions? = definedExternally)
    fun canGoBack(): Boolean
    fun createHref(href: String): String
    fun block(blocker: NavigationBlocker): () -> Unit
    fun flush()
    fun destroy()
    fun notify(action: SubscriberHistoryAction)
    val _ignoreSubscribers: Boolean?
}
