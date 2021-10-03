@file:JsModule("react")
@file:JsNonModule

package react

import kotlinext.js.ReadonlyArray

external object Children {
    fun <T> map(children: Any?, handler: (ReactNode) -> T): ReadonlyArray<T>?
    fun forEach(children: Any?, handler: (ReactNode) -> Unit)
    fun count(children: Any?): Int
    fun only(children: Any?): ReactElement
    fun toArray(children: Any?): ReadonlyArray<ReactNode>
}
