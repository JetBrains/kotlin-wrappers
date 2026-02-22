package tanstack.react.router

import js.reflect.unsafeCast
import tanstack.react.router.raw.useMatchRouteRaw

fun useMatchRoute(): UseMatchRouteResult {
    val matchRouteRaw = useMatchRouteRaw()
    return { options ->
        val result = matchRouteRaw(options)
            .takeIf { it != false }

        unsafeCast(result)
    }
}
