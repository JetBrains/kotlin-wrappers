package react.router


sealed external interface NavigationContextObject {
    var basename: String
    var navigator: Navigator
    var static: Boolean
}
