@file:JsModule("redux")
package redux

external fun <S> createStore(
        reducer: Reducer<S, Action>,
        preloadedState: S
): Store<S, Action, Action>

external fun <S, A, R> createStore(
        reducer: Reducer<S, A>,
        preloadedState: S,
        enhancer: Enhancer<S, Action, Action, A, R>
): Store<S, A, R>

external fun <S, A> combineReducers(reducers: ReducerContainer<*, A>): Reducer<S, A>

external fun <A, R> bindActionCreators(actionCreators: ActionCreatorContainer<A>, dispatch: (A) -> R): BoundActionCreatorContainer<A, R>

external fun <S, A1, R1, A2, R2> applyMiddleware(vararg middlewares: Middleware<S, A1, R1, A2, R2>): Enhancer<S, A1, R1, A2, R2>

external fun <A, T1, R> compose(function1: (T1) -> R , function2: (A) -> T1): (A) -> R

external fun <A, T1, T2, R> compose(function1: (T2) -> R , function2: (T1) -> T2, function3: (A) -> T1): (A) -> R

external fun <A, T1, T2, T3, R> compose(function1: (T3) -> R, function2: (T2) -> T3, function3: (T1) -> T2, function4: (A) -> T1): (A) -> R
