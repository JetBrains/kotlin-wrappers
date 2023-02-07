package react

sealed external interface ForwardRefExoticComponent<in P : PropsWithRef<*>> :
    NamedExoticComponent<P>
