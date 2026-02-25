@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useReducer)
 */
external fun <S, A, I> useReducer(
    reducer: Reducer<S, A>,
    initializerArg: I,
    initializer: (I) -> S,
): ReducerInstance<S, A>

/**
 * [Online Documentation](https://react.dev/reference/react/useReducer)
 */
external fun <S, A> useReducer(
    reducer: Reducer<S, A>,
    initialState: S,
): ReducerInstance<S, A>

/**
 * [Online Documentation](https://react.dev/reference/react/useReducer)
 */
external fun <S : Any, A> useReducer(
    reducer: Reducer<S?, A>,
): ReducerInstance<S?, A>
