@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external interface AwaitProps : react.Props {
    var children: AwaitResolveRenderFunction
    var errorElement: react.ReactNode?
    var resolve: Any /* TrackedPromise | any */
}

