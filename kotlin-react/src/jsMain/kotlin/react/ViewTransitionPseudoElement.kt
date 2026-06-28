package react

import react.canary.ReactCanary
import web.animations.Animatable
import web.cssom.CSSStyleDeclaration

@ReactCanary
external interface ViewTransitionPseudoElement :
    Animatable {

    fun getComputedStyle(): CSSStyleDeclaration
}
