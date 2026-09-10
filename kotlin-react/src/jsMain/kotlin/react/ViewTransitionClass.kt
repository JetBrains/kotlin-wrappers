package react

import js.objects.recordOf
import js.reflect.unsafeCast
import seskar.js.JsValue
import web.cssom.ClassName

// type ViewTransitionClassPerType = Record<"default" | (string & {}), "none" | "auto" | (string & {})>;
// type ViewTransitionClass = ViewTransitionClassPerType | ViewTransitionClassPerType[string];

sealed external interface ViewTransitionClass {
    companion object {
        @JsValue("auto")
        val auto: ViewTransitionClass

        @JsValue("none")
        val none: ViewTransitionClass
    }
}

inline fun ViewTransitionClass(
    value: ClassName,
): ViewTransitionClass =
    unsafeCast(value)

// TODO: add "default" support
inline fun ViewTransitionClass(
    vararg values: Pair<ViewTransitionType, ClassName>,
): ViewTransitionClass =
    unsafeCast(recordOf(pairs = values))
