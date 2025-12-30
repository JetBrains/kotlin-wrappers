@file:JsModule("@tanstack/router-core")

package tanstack.router.core

import js.array.ReadonlyArray

open external class BaseRoute<TChild : BaseRoute<TChild>>
private constructor() {
    fun addChildren(
        children: ReadonlyArray<TChild>,
    ) /* : this */
}
