@file:JsModule("react")
@file:JsNonModule

package react

sealed external interface ReactElement : ReactNode {
    val type: ElementType<*>
    val props: Props
    val key: Key?
}

external fun <P : Props> createElement(
    type: String,
    props: P = definedExternally,
    vararg children: ReactNode?,
): ReactElement

external fun <P : Props> createElement(
    type: ElementType<P>,
    props: P = definedExternally,
    vararg children: ReactNode?,
): ReactElement

external fun <P : Props> cloneElement(
    element: ReactElement,
    props: P = definedExternally,
    vararg children: ReactNode?,
): ReactElement

external fun isValidElement(
    element: Any,
): Boolean
