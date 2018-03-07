@file:Suppress("unused")
package redux

import kotlinext.js.js

class RStore<S>(var reducer: (S, RAction) -> S, preloadedState: S) {
    private val store = Store(::wrapperReducer, preloadedState)

    val state: S
        get() = store.getState()

    fun subscribe(listener: () -> Unit) = store.subscribe(listener)

    fun dispatch(action: RAction) = store.dispatch(js {
        type = action::class.simpleName
        this.action = action
    } as WrapperAction)

    private fun wrapperReducer(state: S, action: WrapperAction) = reducer(state, action.action)
}

internal interface WrapperAction {
    val type: String
    val action: RAction
}
