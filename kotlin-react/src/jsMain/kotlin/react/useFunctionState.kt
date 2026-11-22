package react

import react.raw.useStateRaw

// [Problem details](https://medium.com/swlh/how-to-store-a-function-with-the-usestate-hook-in-react-8a88dd4eede1)

inline fun <T : Any> useFunctionState(): FunctionStateInstance<T?> =
    FunctionStateInstance(useStateRaw())

inline fun <T> useFunctionState(
    initialValue: T,
): FunctionStateInstance<T> =
    FunctionStateInstance(useStateRaw(initialValue))

inline fun <T> useFunctionState(
    noinline initializer: () -> T,
): FunctionStateInstance<T> =
    FunctionStateInstance(useStateRaw(initializer))
