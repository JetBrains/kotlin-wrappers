// Automatically generated - do not modify!

@file:JsModule("@mui/material/Avatar")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface AvatarProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * Used in combination with `src` or `srcSet` to
     * provide an alt attribute for the rendered `img` element.
     */
    var alt: String?

    /**
     * Used to render icon or text elements inside the Avatar if `src` is not set.
     * This can be an element, or just a string.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarClasses?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attributes) applied to the `img` element if the component is used to display an image.
     * It can be used to listen for the loading error event.
     */
    var imgProps: react.dom.html.ImgHTMLAttributes<org.w3c.dom.HTMLImageElement>?

    /**
     * The `sizes` attribute for the `img` element.
     */
    var sizes: String?

    /**
     * The `src` attribute for the `img` element.
     */
    var src: String?

    /**
     * The `srcSet` attribute for the `img` element.
     * Use this attribute for responsive image display.
     */
    var srcSet: String?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The shape of the avatar.
     * @default 'circular'
     */
    var variant: mui.system.Union? /* 'circular' | 'rounded' | 'square', AvatarPropsVariantOverrides */
}

/**
 *
 * Demos:
 *
 * - [Avatars](https://mui.com/components/avatars/)
 *
 * API:
 *
 * - [Avatar API](https://mui.com/api/avatar/)
 */
@JsName("default")
external val Avatar: react.FC<AvatarProps>
