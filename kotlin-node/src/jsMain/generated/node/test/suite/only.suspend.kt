// Generated by Karakum - do not modify it manually!

package node.test.suite

import node.test.SuiteFn
import node.test.TestOptions


suspend fun only(
    name: String = undefined.unsafeCast<Nothing>(),
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: SuiteFn = undefined.unsafeCast<Nothing>(),
): Unit =
    onlyAsync(
        name, options, fn
    ).await()


suspend fun only(name: String = undefined.unsafeCast<Nothing>(), fn: SuiteFn = undefined.unsafeCast<Nothing>()): Unit =
    onlyAsync(
        name, fn
    ).await()


suspend fun only(
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: SuiteFn = undefined.unsafeCast<Nothing>(),
): Unit =
    onlyAsync(
        options, fn
    ).await()


suspend fun only(fn: SuiteFn = undefined.unsafeCast<Nothing>()): Unit =
    onlyAsync(
        fn
    ).await()


suspend fun only(): Unit =
    onlyAsync(

    ).await()
