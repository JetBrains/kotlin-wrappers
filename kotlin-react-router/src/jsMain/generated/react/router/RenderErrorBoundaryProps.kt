package react.router

import remix.run.router.Location
import remix.run.router.RevalidationState


sealed external interface RenderErrorBoundaryProps : react.PropsWithChildren {
    var location: Location
    var revalidation: RevalidationState
    var error: Any?
    var component: react.ReactNode
    var routeContext: RouteContextObject
}
