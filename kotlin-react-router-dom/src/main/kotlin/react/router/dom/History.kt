@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

// TODO: Move to separate "history" module
external interface History {
    val length: Int
    val action: String
    var location: Location

    fun push(path: String, state: dynamic = definedExternally)
    fun replace(path: String, state: dynamic = definedExternally)
    fun go(n: Int)
    fun goBack()
    fun goForward()
}
