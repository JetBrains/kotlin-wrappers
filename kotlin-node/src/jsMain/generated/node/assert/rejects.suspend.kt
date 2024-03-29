// Generated by Karakum - do not modify it manually!

package node.assert

import js.promise.Promise
import js.promise.await


suspend fun rejects(block: () -> Promise<Any?>, message: String = undefined.unsafeCast<Nothing>()): Unit =
    rejectsAsync(
        block, message
    ).await()


suspend fun rejects(
    block: () -> Promise<Any?>,
    message: Throwable /* JsError */ = undefined.unsafeCast<Nothing>(),
): Unit =
    rejectsAsync(
        block, message
    ).await()


suspend fun rejects(block: Promise<Any?>, message: String = undefined.unsafeCast<Nothing>()): Unit =
    rejectsAsync(
        block, message
    ).await()


suspend fun rejects(block: Promise<Any?>, message: Throwable /* JsError */ = undefined.unsafeCast<Nothing>()): Unit =
    rejectsAsync(
        block, message
    ).await()


suspend fun rejects(
    block: () -> Promise<Any?>,
    error: AssertPredicate,
    message: String = undefined.unsafeCast<Nothing>(),
): Unit =
    rejectsAsync(
        block, error, message
    ).await()


suspend fun rejects(
    block: () -> Promise<Any?>,
    error: AssertPredicate,
    message: Throwable /* JsError */ = undefined.unsafeCast<Nothing>(),
): Unit =
    rejectsAsync(
        block, error, message
    ).await()


suspend fun rejects(
    block: Promise<Any?>,
    error: AssertPredicate,
    message: String = undefined.unsafeCast<Nothing>(),
): Unit =
    rejectsAsync(
        block, error, message
    ).await()


suspend fun rejects(
    block: Promise<Any?>,
    error: AssertPredicate,
    message: Throwable /* JsError */ = undefined.unsafeCast<Nothing>(),
): Unit =
    rejectsAsync(
        block, error, message
    ).await()
