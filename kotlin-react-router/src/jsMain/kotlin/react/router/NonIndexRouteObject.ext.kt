@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package react.router

import kotlin.contracts.contract

fun isNonIndexRouteObject(routeObject: RouteObject): Boolean {
    contract {
        returns(true) implies (routeObject is NonIndexRouteObject)
    }
    return routeObject.asDynamic().index != true
}
