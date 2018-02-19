package redux

import kotlinext.js.js

@Suppress("unused")
class RStore<S>(var reducer: (S, RAction) -> S, preloadedState: S) {
    private val store = Store(::wrapperReducer, preloadedState)

    val state: S
        get() = store.getState()

    fun subscribe(listener: () -> Unit) = store.subscribe(listener)

    fun dispatch(action: RAction) = store.dispatch(js {
        type = "WRAPPER_ACTION"
        this.action = action
    })

    private fun wrapperReducer(state: S, action: dynamic) = when (action.type) {
        "WRAPPER_ACTION" -> reducer(state, action.action)
        else -> state
    }
}
