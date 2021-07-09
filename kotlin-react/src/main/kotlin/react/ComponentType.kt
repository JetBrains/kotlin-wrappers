package react

external interface ComponentType<in P : RProps>

// TODO: Should extend RComponentClassStatics, but has problems with generic params
external interface ComponentClass<in P : RProps> :
    ComponentType<P>,
    RComponentClassStatics<RProps, RState, RContext<*>?>

external interface FunctionComponent<in P : RProps> :
    ComponentType<P>
