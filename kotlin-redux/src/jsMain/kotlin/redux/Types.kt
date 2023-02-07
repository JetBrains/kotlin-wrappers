package redux

external interface Action {
    val type: String
}

external interface Store<S, A, R> {
    fun getState(): S

    fun dispatch(action: A): R

    fun subscribe(listener: () -> Unit): () -> Unit

    fun replaceReducer(nextReducer: Reducer<S, A>)
}

external interface ReducerContainer<S, A>

external interface ActionCreatorContainer<A>

external interface BoundActionCreatorContainer<A, R>

external interface MiddlewareApi<S, A, R> {
    fun getState(): S

    fun dispatch(action: A): R
}

typealias Reducer<S, A> = (S, A) -> S

typealias StoreCreator<S, A, R> = (Reducer<S, A>, S) -> Store<S, A, R>

typealias Enhancer<S, A1, R1, A2, R2> = (StoreCreator<S, A1, R1>) -> StoreCreator<S, A2, R2>

typealias Middleware<S, A1, R1, A2, R2> = (MiddlewareApi<S, A1, R1>) -> ((A1) -> R1) -> (A2) -> R2
