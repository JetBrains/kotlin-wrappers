package react.jsx.runtime

import js.internal.InternalApi
import js.objects.Object
import js.objects.unsafeJso
import js.reflect.Reflect.deleteProperty
import js.reflect.unsafeCast
import react.*
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

    var finalProps = props
    val finalKey = props.key ?: defaultKey

    val builderChildren = props.getBuilderChildren()
    if (props.key != null || builderChildren != null) {
        finalProps = Object.assign(unsafeJso(), props)
        deleteProperty(finalProps, "key")

        if (builderChildren != null) {
            unsafeCast<PropsWithChildren>(finalProps)
                .children = builderChildren
        }
    }

    // TODO: use `jsx` if no children?
    return jsxsRaw(
        type = type,
        props = finalProps,
        key = finalKey,
    )
}
