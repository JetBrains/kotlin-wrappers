package js.import

external interface Module<out T : Any> {
    val default: T
}
