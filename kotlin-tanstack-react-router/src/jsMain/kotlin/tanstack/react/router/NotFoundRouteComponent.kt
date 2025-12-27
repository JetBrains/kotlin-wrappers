package tanstack.react.router

import react.ComponentType
import react.Props

external interface NotFoundRouteProps :
    Props {
    var data: Any?
    var isNotFound: Boolean
    var routeId: RouteId
}

typealias NotFoundRouteComponent = ComponentType<NotFoundRouteProps>
