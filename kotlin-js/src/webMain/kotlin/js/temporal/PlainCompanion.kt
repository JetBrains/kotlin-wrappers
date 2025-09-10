package js.temporal

import kotlin.js.JsAny

sealed external interface PlainCompanion<T : JsAny, in L : JsAny> :
    Factory<T, L, AssignmentOptions>,
    Comparator<T, L>
