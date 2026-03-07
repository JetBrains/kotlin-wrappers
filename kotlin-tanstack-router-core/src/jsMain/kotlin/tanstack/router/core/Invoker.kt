package tanstack.router.core

import js.objects.unsafeJso
import js.reflect.unsafeCast

class Invoker<O : Any, R>
private constructor() {
    inline operator fun invoke(
        noinline block: O.() -> Unit,
    ): R =
        invokeInternal(invoker = this, block = block)
}

private external interface InvokerInternal<O : Any, R> {
    operator fun invoke(
        options: O,
    ): R
}

@PublishedApi
internal fun <O : Any, R> invokeInternal(
    invoker: Invoker<O, R>,
    block: O.() -> Unit,
): R =
    unsafeCast<InvokerInternal<O, R>>(invoker)
        .invoke(options = unsafeJso(block))
