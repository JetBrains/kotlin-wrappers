package react

import js.objects.Object

fun <P : Props> kotlinMemo(
    type: ComponentType<P>,
): FC<P> =
    memo(type, ::propsAreEqual)

private fun <P : Props> propsAreEqual(
    oldProps: P,
    newProps: P,
): Boolean =
    sequenceOf(oldProps, newProps)
        .flatMap { Object.keys(it).asSequence() }
        .distinct()
        .all { key ->
            val oldValue: Any? = oldProps.asDynamic()[key]
            val newValue: Any? = newProps.asDynamic()[key]
            newValue == oldValue
        }
