package react.jsx.runtime

import js.objects.unsafeJso
import js.reflect.Reflect.deleteProperty
import react.ElementType
import react.Key
import react.Props
import react.ReactElement
import react.jsx.runtime.raw.jsxRaw
import react.jsx.runtime.raw.jsxsRaw

fun <P : Props> jsx(
    type: ElementType<P>,
): ReactElement<P> =
    jsxRaw(
        type = type,
        props = unsafeJso(),
    )

fun <P : Props> jsx(
    type: ElementType<P>,
    props: P?,
    defaultKey: Key?,
): ReactElement<P> {
    if (props == null)
        return jsxRaw(
            type = type,
            props = unsafeJso(),
            key = defaultKey,
        )

    val key = props.key ?: defaultKey
    deleteProperty(props, "key")

    // TODO: use `jsx` if no children?
    return jsxsRaw(
        type = type,
        props = props,
        key = key,
    )
}
