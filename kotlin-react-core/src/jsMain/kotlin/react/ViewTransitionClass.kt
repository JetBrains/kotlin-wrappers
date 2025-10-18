package react

import js.objects.recordOf
import js.reflect.unsafeCast
import react.canary.ReactCanary
import seskar.js.JsValue
import web.cssom.ClassName

// type ViewTransitionClassPerType = Record<"default" | (string & {}), "none" | "auto" | (string & {})>;
// type ViewTransitionClass = ViewTransitionClassPerType | ViewTransitionClassPerType[string];

@ReactCanary
sealed external interface ViewTransitionClass {
    companion object {
        @JsValue("auto")
        val auto: ViewTransitionClass

        @JsValue("none")
        val none: ViewTransitionClass
    }
}

@ReactCanary
inline fun ViewTransitionClass(
    value: ClassName,
): ViewTransitionClass =
    unsafeCast(value)

// TODO: add "default" support
@ReactCanary
inline fun ViewTransitionClass(
    vararg values: Pair<ViewTransitionType, ClassName>,
): ViewTransitionClass =
    unsafeCast(recordOf(pairs = values))
