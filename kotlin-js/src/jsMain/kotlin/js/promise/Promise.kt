package js.promise

import js.core.ReadonlyArray
import js.core.Void
import kotlin.js.Promise

inline fun Promise.Companion.resolve(): Promise<Void> =
    resolve(undefined)

inline fun <S> Promise.Companion.all(
    values: ReadonlyArray<PromiseResult<S>>,
): Promise<ReadonlyArray<S>> =
    all(promise = values.unsafeCast<ReadonlyArray<Promise<S>>>())
