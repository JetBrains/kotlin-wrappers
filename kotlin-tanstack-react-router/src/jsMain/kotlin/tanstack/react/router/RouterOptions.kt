package tanstack.react.router

import js.errors.JsError
import js.objects.JsPlainObject
import react.ComponentType
import react.ErrorInfo
import react.PropsWithChildren

@JsPlainObject
external interface RouterOptions :
    tanstack.router.core.RouterOptions {
    /**
     * The default `component` a route should use if no component is provided.
     *
     * `default` - Outlet
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultcomponent-property)
     */
    val defaultComponent: RouteComponent?

    /**
     * The default `errorComponent` a route should use if no error component is provided.
     *
     * `default` - ErrorComponent
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaulterrorcomponent-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#handling-errors-with-routeoptionserrorcomponent)
     */
    val defaultErrorComponent: ErrorRouteComponent?

    /**
     * The default `pendingComponent` a route should use if no pending component is provided.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultpendingcomponent-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#showing-a-pending-component)
     */
    val defaultPendingComponent: RouteComponent?

    /**
     * The default `notFoundComponent` a route should use if no notFound component is provided.
     *
     * `default` - NotFound
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultnotfoundcomponent-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/not-found-errors#default-router-wide-not-found-handling)
     */
    val defaultNotFoundComponent: NotFoundRouteComponent?

    /**
     * A component that will be used to wrap the entire router.
     *
     * This is useful for providing a context to the entire router.
     *
     * Only non-DOM-rendering components like providers should be used, anything else will cause a hydration error.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#wrap-property)
     */
    val Wrap: ComponentType<PropsWithChildren>?

    /**
     * A component that will be used to wrap the inner contents of the router.
     *
     * This is useful for providing a context to the inner contents of the router where you also need access to the router context and hooks.
     *
     * Only non-DOM-rendering components like providers should be used, anything else will cause a hydration error.
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#innerwrap-property)
     */
    val InnerWrap: ComponentType<PropsWithChildren>?

    /**
     * The default `onCatch` handler for errors caught by the Router ErrorBoundary
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RouterOptionsType#defaultoncatch-property)
     * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/data-loading#handling-errors-with-routeoptionsoncatch)
     */
    val defaultOnCatch: ((error: JsError, errorInfo: ErrorInfo) -> Unit)?
}
