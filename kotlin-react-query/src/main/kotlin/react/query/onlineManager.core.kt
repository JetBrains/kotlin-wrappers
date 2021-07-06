// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

open external class OnlineManager : Subscribable<Listener> {
    override fun onSubscribe()
    open fun setEventListener(setup: (setOnline: (online: Boolean?) -> Unit) -> () -> Unit)
    open fun setOnline(online: Boolean = definedExternally)
    open fun onOnline()
    open fun isOnline(): Boolean
}

external val onlineManager: OnlineManager
