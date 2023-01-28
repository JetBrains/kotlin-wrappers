@file:JsModule("react-router/context")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external interface IndexRouteObject {
    var caseSensitive: Any /* AgnosticIndexRouteObject["caseSensitive"] */?
    var path: Any /* AgnosticIndexRouteObject["path"] */?
    var id: Any /* AgnosticIndexRouteObject["id"] */?
    var loader: Any /* AgnosticIndexRouteObject["loader"] */?
    var action: Any /* AgnosticIndexRouteObject["action"] */?
    var hasErrorBoundary: Any /* AgnosticIndexRouteObject["hasErrorBoundary"] */?
    var shouldRevalidate: Any /* AgnosticIndexRouteObject["shouldRevalidate"] */?
    var handle: Any /* AgnosticIndexRouteObject["handle"] */?
    var index: Boolean
    var children: Any? /* some expression */
    var element: react.ReactNode?
    var errorElement: react.ReactNode?
}

