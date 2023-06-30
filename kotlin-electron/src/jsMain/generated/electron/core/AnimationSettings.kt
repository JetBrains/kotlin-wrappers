package electron.core


external interface AnimationSettings {
    /**
     * Returns true if rich animations should be rendered. Looks at session type (e.g.
     * remote desktop) and accessibility settings to give guidance for heavy
     * animations.
     */
    var shouldRenderRichAnimation: Boolean

    /**
     * Determines on a per-platform basis whether scroll animations (e.g. produced by
     * home/end key) should be enabled.
     */
    var scrollAnimationsEnabledBySystem: Boolean

    /**
     * Determines whether the user desires reduced motion based on platform APIs.
     */
    var prefersReducedMotion: Boolean
}
