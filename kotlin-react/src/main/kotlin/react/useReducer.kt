@file:JsModule("react")
@file:JsNonModule

package react

external fun <S, A, I> useReducer(
    reducer: RReducer<S, A>,
    initializerArg: I,
    initializer: (I) -> S,
): ReducerInstance<S, A>

external fun <S, A> useReducer(
    reducer: RReducer<S, A>,
    initialState: S,
): ReducerInstance<S, A>

external fun <S : Any, A> useReducer(
    reducer: RReducer<S?, A>,
): ReducerInstance<S?, A>
