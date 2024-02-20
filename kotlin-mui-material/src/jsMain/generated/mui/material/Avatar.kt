// Automatically generated - do not modify!

@file:JsModule("@mui/material/Avatar")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AvatarProps :
    AvatarOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface AvatarSlots {
    /**
     * The component that renders the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var img: react.ComponentType<*>?
}

external interface AvatarOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * Used in combination with `src` or `srcSet` to
     * provide an alt attribute for the rendered `img` element.
     */
    var alt: String?

    /**
     * Used to render icon or text elements inside the Avatar if `src` is not set.
     * This can be an element, or just a string.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarClasses?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attributes) applied to the `img` element if the component is used to display an image.
     * It can be used to listen for the loading error event.
     * @deprecated Use `slotProps.img` instead. This prop will be removed in v7. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/).
     */
    var imgProps: react.dom.html.ImgHTMLAttributes<web.html.HTMLImageElement>?

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
    override var sx: SxProps<Theme>?

    /**
     * The shape of the avatar.
     * @default 'circular'
     */
    var variant: AvatarVariant?
}

/**
 *
 * Demos:
 *
 * - [Avatar](https://mui.com/material-ui/react-avatar/)
 *
 * API:
 *
 * - [Avatar API](https://mui.com/material-ui/api/avatar/)
 */
@JsName("default")
external val Avatar: react.FC<AvatarProps>
