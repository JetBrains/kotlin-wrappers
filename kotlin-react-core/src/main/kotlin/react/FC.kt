package react

external interface FC<in P : Props> :
    ComponentType<P> {
    var displayName: String?
}
