package react

external interface ComponentType<in P : RProps>

external interface ComponentClass<in P : RProps> :
    ComponentType<P>,
    RComponentClassStatics<P, RState, RContext<*>?>

external interface FunctionComponent<in P : RProps> :
    ComponentType<P>
