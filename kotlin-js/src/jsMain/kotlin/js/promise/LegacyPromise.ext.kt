package js.promise

import js.core.ReadonlyArray
import js.core.Void

inline fun kotlin.js.Promise.Companion.resolve(): Promise<Void> =
    resolve(undefined)

inline fun <S> kotlin.js.Promise.Companion.all(
    values: ReadonlyArray<PromiseResult<S>>,
): Promise<ReadonlyArray<S>> =
    all(promise = values.unsafeCast<ReadonlyArray<Promise<S>>>())
