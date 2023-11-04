package react.router


sealed external interface AwaitProps : react.Props {
    var children: AwaitResolveRenderFunction
    var errorElement: react.ReactNode?
    var resolve: Any? /* TrackedPromise | any */
}
