package react

import js.internal.InternalApi

@SubclassOptInRequired(InternalApi::class)
external interface ComponentType<in P : Props> :
    ElementType<P>
