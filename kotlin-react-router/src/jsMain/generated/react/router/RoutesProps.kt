@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


sealed external interface RoutesProps : react.PropsWithChildren {
    var location: Any /* Partial<Location> | string */?
}
