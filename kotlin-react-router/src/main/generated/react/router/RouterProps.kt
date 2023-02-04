@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.Action as NavigationType


external interface RouterProps : react.Props {
    var basename: String?
    var children: react.ReactNode?
    var location: Any /* Partial<Location> | string */
    var navigationType: NavigationType?
    var navigator: Navigator
    var static: Boolean?
}

