package tanstack.router.core

import js.objects.unsafeJso
import js.promise.Promise
import js.promise.await

@JsName("Function")
external class SuspendInvoker<O : Any, R>
private constructor() {
    internal /* raw */
    operator fun invoke(
        options: O,
    ): Promise<R>
}

suspend operator fun <R> SuspendInvoker<*, R>.invoke(): R =
    invoke(options = unsafeJso()).await()

suspend operator fun <O : Any, R> SuspendInvoker<O, R>.invoke(
    block: O.() -> Unit,
): R =
    invoke(options = unsafeJso(block)).await()
