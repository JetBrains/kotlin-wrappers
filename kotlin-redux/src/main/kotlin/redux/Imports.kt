@file:JsModule("redux")
package redux

@JsName("createStore")
internal external class Store<out S>(reducer: (S, dynamic) -> S, preloadedState: S) {
    fun getState(): S
    fun dispatch(action: dynamic)
    fun subscribe(listener: () -> Unit): () -> Unit
}
