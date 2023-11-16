@file:JsModule("react")

package react

// [Problem details](https://medium.com/swlh/how-to-store-a-function-with-the-usestate-hook-in-react-8a88dd4eede1)

@JsName("useState")
external fun <T : Any> useFunctionState(): FunctionStateInstance<T?>

@JsName("useState")
external fun <T> useFunctionState(
    initialValue: T,
): FunctionStateInstance<T>

@JsName("useState")
external fun <T> useFunctionState(
    initializer: () -> T,
): FunctionStateInstance<T>
