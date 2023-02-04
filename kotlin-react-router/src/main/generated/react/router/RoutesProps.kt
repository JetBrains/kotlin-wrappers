@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external interface RoutesProps : react.Props {
    var children: react.ReactNode?
    var location: Any /* Partial<Location> | string */?
}

