package tanstack.router.core

import js.objects.unsafeJso
import js.promise.Promise
import js.promise.await
import js.reflect.unsafeCast

class SuspendInvoker<O : Any, R>
private constructor() {
    suspend inline operator fun invoke(): R =
        invokeInternal(invoker = this)

    suspend inline operator fun invoke(
        noinline block: O.() -> Unit,
    ): R =
        invokeInternal(invoker = this, block = block)
}

private external interface SuspendInvokerInternal<O : Any, R> {
    operator fun invoke(
        options: O,
    ): Promise<R>
}

@PublishedApi
internal suspend fun <R> invokeInternal(
    invoker: SuspendInvoker<*, R>,
): R =
    unsafeCast<SuspendInvokerInternal<*, R>>(invoker)
        .invoke(options = unsafeJso()).await()

@PublishedApi
internal suspend fun <O : Any, R> invokeInternal(
    invoker: SuspendInvoker<O, R>,
    block: O.() -> Unit,
): R =
    unsafeCast<SuspendInvokerInternal<O, R>>(invoker)
        .invoke(options = unsafeJso(block)).await()
