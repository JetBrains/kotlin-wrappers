package react

inline var FC<*>.displayName: String?
    get() = asDynamic().displayName
    set(value) {
        asDynamic().displayName = value
    }

inline var NamedExoticComponent<*>.displayName: String?
    get() = asDynamic().displayName
    set(value) {
        asDynamic().displayName = value
    }

inline var Context<*>.displayName: String?
    get() = asDynamic().displayName
    set(value) {
        asDynamic().displayName = value
    }
