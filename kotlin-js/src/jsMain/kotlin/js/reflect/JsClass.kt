package js.reflect

inline fun <T : Any> JsClass<T>.newInstance(): T =
    newInstance(this)

@Suppress("UNUSED_PARAMETER")
fun <T : Any> newInstance(
    clazz: JsClass<T>,
): T =
    js("new clazz()")
