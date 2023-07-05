package js.core

fun <T> IteratorResult<T, *>.asYieldOrNull(): IteratorYieldResult<T> =
    takeIf { !it.done }.unsafeCast<IteratorYieldResult<T>?>()

fun <T> IteratorResult<T, *>.asYield(): IteratorYieldResult<T> =
    checkNotNull(asYieldOrNull())
