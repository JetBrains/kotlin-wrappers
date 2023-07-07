package react.router

import remix.run.router.ActionFunction
import remix.run.router.LazyRouteFunction
import remix.run.router.LoaderFunction
import remix.run.router.ShouldRevalidateFunction


sealed external interface RouteObject {
    var caseSensitive: Boolean?
    var path: String?
    var id: String?
    var loader: LoaderFunction?
    var action: ActionFunction?
    var hasErrorBoundary: Boolean?
    var shouldRevalidate: ShouldRevalidateFunction?
    var handle: Any?
    var index: Boolean?
    var children: js.core.ReadonlyArray<RouteObject>?
    var element: (react.ReactNode)?
    var errorElement: (react.ReactNode)?
    var Component: react.ComponentType<*>?
    var ErrorBoundary: react.ComponentType<*>?
    var lazy: LazyRouteFunction<RouteObject>?
}
