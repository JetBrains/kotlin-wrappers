@file:JsModule("redux")
package redux

external fun <S, A> createStore(
        reducer: Reducer<S, A>,
        preloadedState: S,
        enhancer: Enhancer<S, dynamic, A> = definedExternally
): Store<S, A>

external fun <S, A> combineReducers(reducers: ReducerContainer<S, A>): Reducer<S, A>

external fun <S, A1, A2> applyMiddleware(middleware: Middleware<S, A1, A2>)

external fun <S, A1, A2, A3> applyMiddleware(middleware1: Middleware<S, A1, A3>, middleware2: Middleware<S, A1, A2>)

external fun compose(vararg functions: dynamic): dynamic
