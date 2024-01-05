package react

import js.objects.Object
import js.objects.jso

fun <T : Any, P : PropsWithRef<T>> ForwardRef(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): ForwardRefExoticComponent<P> =
    rawForwardRef { props, forwardedRef ->
        val finalProps = forwardRefProps(props, forwardedRef)
        createElementOrNull { block(finalProps) }
    }

private fun <T : Any, P : PropsWithRef<T>> forwardRefProps(
    props: P,
    forwardedRef: Ref<T>?,
): P {
    forwardedRef ?: return props

    return Object.freeze(
        Object.assign(
            jso { ref = forwardedRef },
            props,
        )
    )
}
