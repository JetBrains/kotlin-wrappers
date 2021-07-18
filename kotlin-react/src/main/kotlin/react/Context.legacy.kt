package react

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Provider", "react.Provider"),
)
typealias RProvider<T> = Provider<T>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Consumer", "react.Consumer"),
)
typealias RConsumer<T> = Consumer<T>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Context", "react.Context"),
)
typealias RContext<T> = Context<T>
