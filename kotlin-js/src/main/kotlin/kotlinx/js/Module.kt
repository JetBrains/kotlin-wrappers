package kotlinx.js

external interface Module<out T : Any> {
    val default: T
}
