package react

inline var Props.ref: Ref<*>?
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }
