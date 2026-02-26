package tanstack.router.core

import js.objects.unsafeJso
import js.promise.Promise
import js.promise.await

value class SuspendInvoker<O : Any, R>
private constructor(
    private val function: (O) -> Promise<R>,
) {
    suspend operator fun invoke(
        block: O.() -> Unit,
    ): R =
        function(unsafeJso(block)).await()
}
