// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

open external class FocusManager : Subscribable<Listener> {
    override fun onSubscribe()
    open fun setEventListener(setup: (setFocused: (focused: Boolean?) -> Unit) -> () -> Unit)
    open fun setFocused(focused: Boolean = definedExternally)
    open fun onFocus()
    open fun isFocused(): Boolean
}

external val focusManager: FocusManager
