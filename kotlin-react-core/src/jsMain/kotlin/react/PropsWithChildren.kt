package react

import js.objects.destruct
import kotlin.reflect.KProperty1

val CHILDREN_PROP: KProperty1<in PropsWithChildren, ReactNode?> =
    PropsWithChildren::children

external interface PropsWithChildren :
    Props,
    // TODO: use as `MutablePropsWithChildren` parent type instead
    ChildrenBuilder {
    var children: ReactNode?
}

private fun PropsWithChildren.childrenAndRest(): Pair<ReactNode?, Props> =
    destruct(CHILDREN_PROP)
