@file:JsModule("redux")
package redux

@JsName("createStore")
internal external class Store<out S>(reducer: (S, WrapperAction) -> S, preloadedState: S) {
    fun getState(): S
    fun dispatch(action: WrapperAction)
    fun subscribe(listener: () -> Unit): () -> Unit
}
