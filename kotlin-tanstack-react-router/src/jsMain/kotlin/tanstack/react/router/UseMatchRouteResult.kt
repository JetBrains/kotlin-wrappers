package tanstack.react.router

import js.objects.unsafeJso
import js.reflect.unsafeCast
import tanstack.react.router.raw.UseMatchRouteResultRaw
import tanstack.router.core.Params

value class UseMatchRouteResult
internal constructor(
    private val function: UseMatchRouteResultRaw,
) {
    operator fun invoke(
        block: UseMatchRouteOptions.() -> Unit,
    ): Params? {
        val result = function(unsafeJso(block))
            .takeIf { it != false }

        return unsafeCast(result)
    }
}
