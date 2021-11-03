package react.dom.html

import org.w3c.dom.Element
import react.Ref

inline var <T : Element> HTMLAttributes<T>.ref: Ref<T>?
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }
