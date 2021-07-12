package react

external interface FunctionComponent<in P : RProps> :
    ComponentType<P>

typealias FC<P> = FunctionComponent<P>

@Deprecated(
    message = "Legacy type alias",
    ReplaceWith("FunctionComponent", "react.FunctionComponent")
)
typealias FunctionalComponent<P> = FunctionComponent<P>
