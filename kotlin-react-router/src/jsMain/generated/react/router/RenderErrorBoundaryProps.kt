@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Location


external interface RenderErrorBoundaryProps : react.PropsWithChildren {
    var location: Location
    var error: Any?
    var component: react.ReactNode
    var routeContext: RouteContextObject
}
