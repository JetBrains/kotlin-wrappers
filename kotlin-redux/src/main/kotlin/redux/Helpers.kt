package redux

import kotlinext.js.assign
import kotlinext.js.js

val <S> Store<S, *>.state: S get() = getState()

fun <S> rEnhancer(): Enhancer<S, RAction, WrapperAction> = { next ->
    { reducer, initialState ->
        fun wrapperReducer(reducer: Reducer<S, RAction>): Reducer<S, WrapperAction> {
            return { state, action -> reducer(state, action.action) }
        }
        val store = next(wrapperReducer(reducer), initialState)
        assign(assign(js {}, store)) {
            dispatch = { action: RAction ->
                store.dispatch(js {
                    type = action::class.simpleName
                    this.action = action
                }.unsafeCast<WrapperAction>())
            }
            replaceReducer = { nextReducer: Reducer<S, RAction> ->
                store.replaceReducer(wrapperReducer(nextReducer))
            }
        }.unsafeCast<Store<S, RAction>>()
    }
}

interface WrapperAction {
    val type: String
    val action: RAction
}

interface RAction
