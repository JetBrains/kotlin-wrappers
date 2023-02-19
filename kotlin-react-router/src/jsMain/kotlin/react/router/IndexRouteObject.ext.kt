@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package react.router

import kotlin.contracts.contract

fun isIndexRouteObject(routeObject: RouteObject): Boolean {
    contract {
        returns(true) implies (routeObject is IndexRouteObject)
    }
    return routeObject.asDynamic().index == true
}
