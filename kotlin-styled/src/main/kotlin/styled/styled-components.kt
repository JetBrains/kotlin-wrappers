@file:JsModule("styled-components")
@file:JsNonModule

package styled

import kotlinext.js.TemplateTag
import react.*

external interface StyledProps : PropsWithChildren, PropsWithClassName {
    @JsName("_css")
    var css: String

    @JsName("_forwardRef")
    var forwardRef: ((Any?) -> Unit)?

    @JsName("_styleDisplayName")
    var styleDisplayName: String?
}

external interface StylerConfig {
    var displayName: String
    var componentId: String
}

external interface Styler : TemplateTag<(StyledProps) -> String, dynamic> {
    fun withConfig(config: StylerConfig): Styler
}

external interface Keyframes {
    val rules: Array<out dynamic>
    fun getName(): String
}

/**
 * A helper method to create keyframes for animations.
 */
external val keyframes: TemplateTag<Nothing, Keyframes>

/**
 * A helper function to generate CSS from a template literal with interpolations.
 * You need to use this if you return a template literal with functions inside an
 * interpolation due to how tagged template literals work in JavaScript.
 */
external val css: TemplateTag<dynamic, String>

/**
 * A helper function to generate a special StyledComponent that handles global styles.
 * Normally, styled components are automatically scoped to a local CSS class and therefore
 * isolated from other components. In the case of createGlobalStyle, this limitation is removed
 * and things like CSS resets or base stylesheets can be applied.
 */
external val createGlobalStyle: TemplateTag<Nothing, ComponentType<Props>>

/**
 * A utility to help identify styled components.
 */
external fun isStyledComponent(component: ComponentClass<*>): Boolean
