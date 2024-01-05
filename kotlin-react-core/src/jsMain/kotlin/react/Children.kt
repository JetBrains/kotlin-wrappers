@file:JsModule("react")

package react

import js.array.ReadonlyArray

external object Children {
    fun <T> map(children: ReactNode?, handler: (ReactNode) -> T): ReadonlyArray<T>?
    fun forEach(children: ReactNode?, handler: (ReactNode) -> Unit)
    fun count(children: ReactNode?): Int
    fun only(children: ReactNode?): ReactElement<*>
    fun toArray(children: ReactNode?): ReadonlyArray<ReactNode>
}
