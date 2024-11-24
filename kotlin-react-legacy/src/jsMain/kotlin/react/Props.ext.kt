package react

import js.reflect.unsafeCast

inline var Props.ref: Ref<*>?
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        unsafeCast<PropsWithRef<Nothing>>(this).ref = value
    }
