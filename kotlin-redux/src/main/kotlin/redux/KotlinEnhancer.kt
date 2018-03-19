package redux

import kotlinext.js.js

fun <S> kotlinEnhancer(next: StoreCreator<S, WrapperAction>): StoreCreator<S, KotlinAction> {
    return { reducer, preloadedState ->
        @Suppress("NAME_SHADOWING") // Needed to allow replaceReducer to mutate reducer
        var reducer = reducer
        val wrapperReducer: Reducer<S, WrapperAction> = { state, action -> reducer(state, action.action) }
        val store = next(wrapperReducer, preloadedState)
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
                reducer = nextReducer
            }
        }
    }
}

interface WrapperAction {
    val type: String
    val action: KotlinAction
}

interface KotlinAction
