package js.temporal

sealed external interface PlainCompanion<T : Any, in L : Any> :
    Factory<T, L, AssignmentOptions>,
    Comparator<T, L>
