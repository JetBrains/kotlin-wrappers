package react

import web.animations.Animatable
import web.cssom.CSSStyleDeclaration

external interface ViewTransitionPseudoElement :
    Animatable {

    fun getComputedStyle(): CSSStyleDeclaration
}
