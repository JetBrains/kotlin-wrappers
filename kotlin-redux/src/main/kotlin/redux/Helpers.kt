package redux

import kotlinext.js.assign
import kotlinext.js.js

val <S> Store<S, *, *>.state: S get() = getState()

fun <S, A> combineReducers(reducers: Map<String, Reducer<*, A>>): Reducer<S, A> = combineReducers(js {
    reducers.forEach { this[it.value] = it.key }
}.unsafeCast<ReducerContainer<S, A>>())

fun <S> rEnhancer(): Enhancer<S, Action, Action, RAction, WrapperAction> = { next ->
    { reducer, initialState ->
        fun wrapperReducer(reducer: Reducer<S, RAction>): Reducer<S, WrapperAction> {
            return { state, action -> reducer(state, action.action) }
        }
        val store = (next.unsafeCast<StoreCreator<S, WrapperAction, WrapperAction>>())(wrapperReducer(reducer), initialState)
        assign(assign(js {}, store)) {
            dispatch = { action: RAction ->
                val result = store.dispatch(js {
                    type = action::class.simpleName
                    this.action = action
                }.unsafeCast<WrapperAction>())
                result
            }
            replaceReducer = { nextReducer: Reducer<S, RAction> ->
                store.replaceReducer(wrapperReducer(nextReducer))
            }
        }.unsafeCast<Store<S, RAction, WrapperAction>>()
    }
}

interface WrapperAction : Action {
    override val type: String
    val action: RAction
}

interface RAction
