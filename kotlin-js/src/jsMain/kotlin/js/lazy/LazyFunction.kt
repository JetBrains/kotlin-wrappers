package js.lazy

import js.promise.PromiseResult

sealed external interface LazyFunction<out R>

suspend operator fun <R> LazyFunction<R>.invoke(): R =
    unsafeCast<PromiseResult<LazyFunctionSource<R>>>()
        .await()()

fun <R> LazyFunction(
    value: LazyFunctionSource<R>,
): LazyFunction<R> =
    value.unsafeCast<LazyFunction<R>>()
