@file:JsModule("react")
@file:JsNonModule

package react

external object Children {
    fun <T> map(children: Any?, handler: (Child) -> T): Array<out T>?
    fun forEach(children: Any?, handler: (Child) -> Unit)
    fun count(children: Any?): Int
    fun only(children: Any?): ReactElement
    fun toArray(children: Any?): Array<out Child>
}
