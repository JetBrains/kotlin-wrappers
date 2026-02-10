package tanstack.react.router

import js.reflect.unsafeCast

fun useMatchRoute(): MatchRouteInstance {
    val matchRouteRaw = useMatchRouteRaw()
    return { options ->
        val result = matchRouteRaw(options)
            .takeIf { it != false }

        unsafeCast(result)
    }
}
