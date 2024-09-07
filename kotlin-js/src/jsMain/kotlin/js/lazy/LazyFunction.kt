package js.lazy

typealias LazyFunction<R> = suspend () -> R

fun <R> LazyFunction(
    value: LazyFunction<R>,
): LazyFunctionProvider<R> =
    LazyFunctionProvider { value }
