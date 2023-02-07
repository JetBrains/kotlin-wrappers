package react

sealed external interface ExoticComponent<in P : Props> :
    ComponentType<P>
