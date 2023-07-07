package react.router


sealed external interface RoutesProps : react.PropsWithChildren {
    var location: (Any /* Partial<Location> | string */)?
}
