@file:JsModule("react")

package react.raw

import react.ForwardRefExoticComponent
import react.PropsWithRef
import react.ReactElement
import react.Ref

@JsName("forwardRef")
external fun <T : Any, P : PropsWithRef<T>> forwardRefRaw(
    render: (props: P, forwardedRef: Ref<T>?) -> ReactElement<*>?,
): ForwardRefExoticComponent<P>
