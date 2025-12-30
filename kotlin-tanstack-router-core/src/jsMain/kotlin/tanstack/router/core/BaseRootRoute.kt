@file:JsModule("@tanstack/router-core")

package tanstack.router.core

open external class BaseRootRoute<TChild : BaseRoute<TChild>>
private constructor() :
    BaseRoute<TChild> {
    // TBD
}
