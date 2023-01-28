@file:JsModule("react-router/context")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external interface DataRouteObject : RouteObject {
    var children: Array<DataRouteObject>?
    var id: String
}

