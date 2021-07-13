package react

external interface RProps

val RProps.children: Any
    get() = asDynamic().children

var RProps.key: String
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().key = value
    }

var RProps.ref: RRef
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }

fun <T> RProps.ref(ref: (T?) -> Unit) {
    asDynamic().ref = ref
}
