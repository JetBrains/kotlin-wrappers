@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/createElement)
 */
external fun <P : Props> createElement(
    type: ElementType<P>,
    props: P? = definedExternally,
    vararg children: ReactNode?,
): ReactElement<P>
