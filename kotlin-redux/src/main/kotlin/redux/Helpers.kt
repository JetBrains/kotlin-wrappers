package redux

import kotlinext.js.*

val <S> Store<S, *, *>.state: S get() = getState()

fun <S, A> combineReducers(reducers: Map<String, Reducer<*, A>>): Reducer<S, A> = combineReducers(js {
    reducers.forEach { this[it.key] = it.value }
}.unsafeCast<ReducerContainer<S, A>>())

fun <A, R> bindActionCreators(actionCreators: Map<String, (Array<Any>) -> A>, dispatch: (A) -> R): Map<String, (Array<Any>) -> R> {
    val result = mutableMapOf<String, (Array<Any>) -> R>()
    with(bindActionCreators(js {
        actionCreators.forEach { this[it.key] = it.value }
    }.unsafeCast<ActionCreatorContainer<A>>(), dispatch)) {
        Object.keys(this).forEach {
            result[it] = asDynamic()[it]
        }
    }
    return result
}

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
