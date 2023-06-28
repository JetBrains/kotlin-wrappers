package js.promise

import js.core.ReadonlyArray
import js.core.Void
import kotlinx.coroutines.await
import kotlin.js.Promise

typealias Promise<T> = kotlin.js.Promise<T>

inline fun Promise.Companion.resolve(): Promise<Void> =
    resolve(undefined)

inline fun <S> Promise.Companion.all(
    values: ReadonlyArray<PromiseResult<S>>,
): Promise<ReadonlyArray<S>> =
    all(promise = values.unsafeCast<ReadonlyArray<Promise<S>>>())

suspend fun <T> Promise<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it) },
    ).await()
