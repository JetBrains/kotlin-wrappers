package tanstack.router.core

import js.objects.unsafeJso

value class Invoker<O : Any, R>
private constructor(
    private val function: (O) -> R,
) {
    operator fun invoke(
        block: O.() -> Unit,
    ): R =
        function(unsafeJso(block))
}
