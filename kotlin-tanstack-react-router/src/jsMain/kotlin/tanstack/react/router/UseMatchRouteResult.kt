package tanstack.react.router

import js.objects.unsafeJso
import js.reflect.unsafeCast
import tanstack.router.core.Params

value class UseMatchRouteResult
private constructor(
    private val function: (options: UseMatchRouteOptions) -> Any, /* Boolean | Params */
) {
    operator fun invoke(
        block: UseMatchRouteOptions.() -> Unit,
    ): Params? {
        val result = function(unsafeJso(block))
            .takeIf { it != false }

        return unsafeCast(result)
    }
}
