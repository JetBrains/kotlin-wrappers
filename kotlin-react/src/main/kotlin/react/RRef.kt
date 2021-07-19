import react.MutableRefObject
import react.Ref
import react.RefObject

@Deprecated(
    message = "Will be removed soon",
    replaceWith = ReplaceWith("Ref", "react.Ref"),
)
typealias RRef = Ref<*>

@Deprecated(
    message = "Will be removed soon",
    replaceWith = ReplaceWith("RefObject", "react.RefObject"),
)
typealias RReadableRef<T> = RefObject<T>

@Deprecated(
    message = "Will be removed soon",
    replaceWith = ReplaceWith("MutableRefObject", "react.MutableRefObject"),
)
typealias RMutableRef<T> = MutableRefObject<T>
