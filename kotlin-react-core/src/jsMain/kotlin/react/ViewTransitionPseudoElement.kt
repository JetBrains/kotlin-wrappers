package react

import react.canary.ReactCanary
import web.cssom.CSSStyleDeclaration
import web.dom.Animatable

@ReactCanary
external interface ViewTransitionPseudoElement :
    Animatable {

    fun getComputedStyle(): CSSStyleDeclaration
}
