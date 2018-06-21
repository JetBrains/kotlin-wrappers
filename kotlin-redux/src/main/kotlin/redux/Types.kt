package redux

external interface Action {
    val type: String
}

external interface Store<S, A> {
    fun getState(): S

    fun dispatch(action: A): A

    fun subscribe(listener: () -> Unit): () -> Unit

    fun replaceReducer(nextReducer: Reducer<S, A>)
}

external interface ReducerContainer<S, A>

external interface MiddlewareApi<S, A> {
    fun getState(): S

    fun dispatch(action: A): A
}

typealias Reducer<S, A> = (S, A) -> S

typealias StoreCreator<S, A> = (Reducer<S, A>, S) -> Store<S, A>

typealias Enhancer<S, A1, A2> = (StoreCreator<S, A2>) -> StoreCreator<S, A1>

typealias Middleware<S, A1, A2> = (MiddlewareApi<S, A2>) -> ((A2) -> A1) -> (A2) -> A1
