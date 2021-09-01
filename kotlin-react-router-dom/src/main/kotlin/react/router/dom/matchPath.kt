@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

external fun matchPath(
    pathName: String,
    path: String,
    parent: Match? = definedExternally,
): Match?

external fun matchPath(
    pathName: String,
    options: MatchOptions,
    parent: Match? = definedExternally,
): Match?
