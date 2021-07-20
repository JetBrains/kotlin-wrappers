import react.MutableRefObject
import react.Ref
import react.RefObject

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Ref", "react.Ref"),
)
typealias RRef = Ref<*>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("RefObject", "react.RefObject"),
)
typealias RReadableRef<T> = RefObject<T>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("MutableRefObject", "react.MutableRefObject"),
)
typealias RMutableRef<T> = MutableRefObject<T>
