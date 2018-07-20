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

external fun <A, T1, R> compose(function1: (T1) -> R , function2: (A) -> T1): (A) -> R

external fun <A, T1, T2, R> compose(function1: (T2) -> R , function2: (T1) -> T2, function3: (A) -> T1): (A) -> R

external fun <A, T1, T2, T3, R> compose(function1: (T3) -> R, function2: (T2) -> T3, function3: (T1) -> T2, function4: (A) -> T1): (A) -> R
