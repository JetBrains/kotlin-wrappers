package remix.run.router


/**
 * Base RouteObject with common props shared by all types of routes
 */

sealed external interface AgnosticBaseRouteObject {
    var caseSensitive: Boolean?
    var path: String?
    var id: String?
    var loader: LoaderFunction?
    var action: ActionFunction?
    var hasErrorBoundary: Boolean?
    var shouldRevalidate: ShouldRevalidateFunction?
    var handle: Any?
    var lazy: LazyRouteFunction<AgnosticBaseRouteObject>?
}
