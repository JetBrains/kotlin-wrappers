package react

external interface RProps

val RProps.children: Any
    get() = asDynamic().children

var RProps.key: Key
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().key = value
    }

var RProps.ref: Ref<*>
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }
