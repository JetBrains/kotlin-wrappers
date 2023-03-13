@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


sealed external interface NavigationContextObject {
    var basename: String
    var navigator: Navigator
    var static: Boolean
}
