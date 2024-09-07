package js.lazy

fun interface LazyFunctionProvider<R> {
    suspend fun get(): LazyFunction<R>
}

suspend operator fun <R> LazyFunctionProvider<R>.invoke(): R =
    get()()
