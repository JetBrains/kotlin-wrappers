@file:JsModule("react-router/context")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external interface NonIndexRouteObject {
    var caseSensitive: Any /* AgnosticNonIndexRouteObject["caseSensitive"] */?
    var path: Any /* AgnosticNonIndexRouteObject["path"] */?
    var id: Any /* AgnosticNonIndexRouteObject["id"] */?
    var loader: Any /* AgnosticNonIndexRouteObject["loader"] */?
    var action: Any /* AgnosticNonIndexRouteObject["action"] */?
    var hasErrorBoundary: Any /* AgnosticNonIndexRouteObject["hasErrorBoundary"] */?
    var shouldRevalidate: Any /* AgnosticNonIndexRouteObject["shouldRevalidate"] */?
    var handle: Any /* AgnosticNonIndexRouteObject["handle"] */?
    var index: Boolean?
    var children: Array<RouteObject>?
    var element: react.ReactNode?
    var errorElement: react.ReactNode?
}

