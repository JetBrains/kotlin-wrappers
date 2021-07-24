package react

external interface State

class BoxedState<T>(var state: T) : State

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("State", "react.State"),
)
typealias RState = State
