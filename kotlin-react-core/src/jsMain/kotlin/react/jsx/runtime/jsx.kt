package react.jsx.runtime

import js.internal.InternalApi
import js.objects.Object
import js.objects.unsafeJso
import js.reflect.Reflect.deleteProperty
import react.ElementType
import react.Key
import react.Props
import react.ReactElement
import react.jsx.runtime.raw.jsxRaw
import react.jsx.runtime.raw.jsxsRaw

@InternalApi
fun <P : Props> jsx(
    type: ElementType<P>,
): ReactElement<P> =
    jsxRaw(
        type = type,
        props = unsafeJso(),
    )

@InternalApi
fun <P : Props> jsx(
    type: ElementType<P>,
    props: P,
): ReactElement<P> =
    jsx(
        type = type,
        props = props,
        defaultKey = null,
    )

@InternalApi
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

    val finalKey = props.key ?: defaultKey
    var finalProps = props
    if (props.key != null) {
        finalProps = Object.assign(unsafeJso(), props)
        deleteProperty(props, "key")
    }

    // TODO: use `jsx` if no children?
    return jsxsRaw(
        type = type,
        props = finalProps,
        key = finalKey,
    )
}
