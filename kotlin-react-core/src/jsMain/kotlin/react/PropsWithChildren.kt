package react

external interface PropsWithChildren : Props,
    // TODO: use as `MutablePropsWithChildren` parent type instead
    ChildrenBuilder {
    var children: ReactNode?
}
