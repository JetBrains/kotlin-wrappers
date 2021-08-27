package react

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Reducer", "react.Reducer"),
)
typealias RReducer<S, A> = Reducer<S, A>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Dispatch", "react.Dispatch"),
)
typealias RDispatch<A> = Dispatch<A>
