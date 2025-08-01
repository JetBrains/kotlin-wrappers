package js.temporal

import js.core.JsAny

sealed external interface PlainCompanion<T : JsAny, in L : JsAny> :
    Factory<T, L, AssignmentOptions>,
    Comparator<T, L>
