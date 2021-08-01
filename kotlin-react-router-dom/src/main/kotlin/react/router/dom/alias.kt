package react.router.dom

typealias GetUserConfirmation = (message: String, callback: (Boolean) -> Unit) -> Unit

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Match", "react.router.dom.Match"),
)
typealias RouteResultMatch<T> = Match<T>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Location", "react.router.dom.Location"),
)
typealias RouteResultLocation = Location

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("History", "react.router.dom.History"),
)
typealias RouteResultHistory = History
