@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Base RouteObject with common props shared by all types of routes
 */

external interface AgnosticBaseRouteObject {
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
