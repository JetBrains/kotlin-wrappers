package react

sealed external interface ForwardRefExoticComponent<in P : PropsWithRef<*>> :
    ExoticComponent<P>,
    HasDisplayName
