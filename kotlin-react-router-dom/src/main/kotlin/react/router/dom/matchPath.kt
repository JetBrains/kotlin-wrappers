@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

@JsName("matchPath")
external fun rawMatchPath(
    pathName: String,
    props: RouteProps,
    parent: Match?,
): Match?
