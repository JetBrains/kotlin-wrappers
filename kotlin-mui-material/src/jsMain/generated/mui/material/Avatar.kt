// Automatically generated - do not modify!

@file:JsModule("@mui/material/Avatar")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import react.dom.html.ImgHTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLImageElement

external interface AvatarProps :
    AvatarOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface AvatarSlots {
    /**
     * The component that renders the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var img: ComponentType<*>
}

external interface AvatarSlotProps : Props {
    /** TS: SlotProps< React.ElementType<React.ImgHTMLAttributes<HTMLImageElement>>, {}, AvatarOwnProps > */
    var img: Any?
}

external interface AvatarSlotsAndSlotProps : Props {
    var slots: AvatarSlots?

    var slotProps: AvatarSlotProps?
}

external interface AvatarOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * Used in combination with `src` or `srcSet` to
     * provide an alt attribute for the rendered `img` element.
     */
    var alt: String?

    /**
     * Used to render icon or text elements inside the Avatar if `src` is not set.
     * This can be an element, or just a string.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarClasses?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attributes) applied to the `img` element if the component is used to display an image.
     * It can be used to listen for the loading error event.
     * @deprecated Use `slotProps.img` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var imgProps: ImgHTMLAttributes<HTMLImageElement>?

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
 * - [Avatar](https://v6.mui.com/material-ui/react-avatar/)
 *
 * API:
 *
 * - [Avatar API](https://v6.mui.com/material-ui/api/avatar/)
 */
@JsName("default")
external val Avatar: FC<AvatarProps>
