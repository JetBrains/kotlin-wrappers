// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

open external class FocusManager : Subscribable<Listener> {
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun setEventListener(setup: FocusManagerSetupFn)
    open fun setFocused(focused: Boolean = definedExternally)
    open fun onFocus()
    open fun isFocused(): Boolean
}
