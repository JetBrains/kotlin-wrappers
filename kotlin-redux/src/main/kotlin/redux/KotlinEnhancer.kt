package redux

import kotlinext.js.js

fun <S> kotlinEnhancer(next: StoreCreator<S, WrapperAction>): StoreCreator<S, KotlinAction> {
    return { reducer, preloadedState ->
        fun wrapReducer(reducer: Reducer<S, KotlinAction>): Reducer<S, WrapperAction> =
                { state, action -> reducer(state, action.action) }
        val store = next(wrapReducer(reducer), preloadedState)
        object: Store<S, KotlinAction> {
            override fun getState() = store.getState()
            override fun dispatch(action: KotlinAction): KotlinAction {
                @Suppress("UnsafeCastFromDynamic") // Needed because explicit cast causes illegal cast exception
                store.dispatch(js {
                    type = action::class.simpleName
                    this.action = action
                })
                return action
            }
            override fun subscribe(listener: () -> Unit) = store.subscribe(listener)
            override fun replaceReducer(nextReducer: Reducer<S, KotlinAction>) {
                store.replaceReducer(wrapReducer(nextReducer))
            }
        }
    }
}

interface WrapperAction {
    val type: String
    val action: KotlinAction
}

interface KotlinAction
