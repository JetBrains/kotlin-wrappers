@file:JsModule("react")
@file:JsNonModule

package react

sealed external interface ReactElement<P : Props> : ReactNode {
    val type: ElementType<P>
    val props: P
    val key: Key?
}

external fun <P : Props> createElement(
    type: ElementType<P>,
    props: P = definedExternally,
    vararg children: ReactNode?,
): ReactElement<P>

external fun <P : Props> cloneElement(
    element: ReactElement<P>,
    props: P = definedExternally,
    vararg children: ReactNode?,
): ReactElement<P>

external fun isValidElement(
    element: Any?,
): Boolean
