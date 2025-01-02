@file:JsModule("react")

package react

external fun <P : Props> createElement(
    type: ElementType<P>,
    props: P? = definedExternally,
    vararg children: ReactNode?,
): ReactElement<P>
