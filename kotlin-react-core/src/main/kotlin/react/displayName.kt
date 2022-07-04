package react

inline var FC<*>.displayName: String?
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().displayName = value
    }

inline var NamedExoticComponent<*>.displayName: String?
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().displayName = value
    }

inline var Context<*>.displayName: String?
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().displayName = value
    }
