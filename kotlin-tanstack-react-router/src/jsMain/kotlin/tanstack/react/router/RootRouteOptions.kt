package tanstack.react.router

import js.objects.JsPlainObject
import react.ComponentType
import react.PropsWithChildren

@JsPlainObject
external interface RootRouteOptions :
    tanstack.router.core.RootRouteOptions,
    UpdatableRouteOptions {
    val shellComponent: ComponentType<PropsWithChildren>?
}
