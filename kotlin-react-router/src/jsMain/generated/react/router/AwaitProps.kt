@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


external interface AwaitProps : react.Props {
    var children: AwaitResolveRenderFunction
    var errorElement: react.ReactNode?
    var resolve: Any /* TrackedPromise | any */
}

