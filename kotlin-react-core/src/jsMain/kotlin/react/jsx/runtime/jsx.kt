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
    val finalKey = props.key
        ?: defaultKey
        ?: undefined

    val builderChildren = props.getBuilderChildren()
    var jsxMode = true

    if (props.key !== undefined || builderChildren != null) {
        finalProps = Object.assign(unsafeJso(), props)
        deleteProperty(finalProps, "key")

        if (builderChildren != null) {
            val singleBuilderChild = builderChildren
                .asNodeArrayOrNull()
                ?.singleOrNull()

            jsxMode = singleBuilderChild != null

            unsafeCast<PropsWithChildren>(finalProps)
                .children = singleBuilderChild ?: builderChildren
        }
    }

    val create = if (jsxMode) jsxRaw else jsxsRaw

    return create(
        type = type,
        props = finalProps,
        key = finalKey,
    )
}
