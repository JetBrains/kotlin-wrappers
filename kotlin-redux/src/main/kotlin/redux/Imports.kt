@file:JsModule("redux")
package redux

external fun <S, A> createStore(reducer: (S, A) -> S, preloadedState: S): Store<S, A>

external interface Store<S, A> {
    fun getState(): S
    fun dispatch(action: A): A
    fun subscribe(listener: () -> Unit): () -> Unit
    fun replaceReducer(nextReducer: (S, A) -> S)
}
