package react

external interface Props {
    var key: Key?
}

inline var Props.ref: Ref<*>?
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }
