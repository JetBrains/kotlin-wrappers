@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import react.ExoticComponent
import react.Props

/**
 * Render the next child match in the route tree. Typically used inside
 * a route component to render nested routes.
 *
 * [Online Documentation](https://tanstack.com/router/latest/docs/framework/react/api/router/outletComponent)
 */
external val Outlet: ExoticComponent<Props>
