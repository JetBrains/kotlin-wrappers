@file:JsModule("react")

package react

import react.canary.ReactCanary

@ReactCanary
external interface ViewTransitionProps :
    PropsWithChildren,
    PropsWithRef<ViewTransitionInstance> {

    /**
     * Assigns the [`view-transition-class`](https://developer.chrome.com/blog/view-transitions-update-io24#view-transition-class) class to the underlying DOM node.
     */
    var default: ViewTransitionClass?

    /**
     * Combined with [className] if this `<ViewTransition>` or its parent Component is mounted and there's no other with the same name being deleted.
     * `"none"` is a special value that deactivates the view transition name under that condition.
     */
    var enter: ViewTransitionClass?

    /**
     * Combined with [className] if this `<ViewTransition>` or its parent Component is unmounted and there's no other with the same name being deleted.
     * `"none"` is a special value that deactivates the view transition name under that condition.
     */
    var exit: ViewTransitionClass?

    /**
     * "auto" will automatically assign a view-transition-name to the inner DOM node.
     * That way you can add a View Transition to a Component without controlling its DOM nodes styling otherwise.
     *
     * A difference between this and the browser's built-in view-transition-name: auto is that switching the DOM nodes within the `<ViewTransition>` component preserves the same name so this example cross-fades between the DOM nodes instead of causing an exit and enter.
     * @default "auto"
     */
    var name: ViewTransitionName?

    /**
     * The `<ViewTransition>` or its parent Component is mounted and there's no other `<ViewTransition>` with the same name being deleted.
     */
    var onEnter: ViewTransitionHandler?

    /**
     * The `<ViewTransition>` or its parent Component is unmounted and there's no other `<ViewTransition>` with the same name being deleted.
     */
    var onExit: ViewTransitionHandler?

    /**
     * This `<ViewTransition>` is being mounted and another `<ViewTransition>` instance with the same name is being unmounted elsewhere.
     */
    var onShare: ViewTransitionHandler?

    /**
     * The content of `<ViewTransition>` has changed either due to DOM mutations or because an inner child `<ViewTransition>` has resized.
     */
    var onUpdate: ViewTransitionHandler?

    /**
     * Combined with [className] if this `<ViewTransition>` is being mounted and another instance with the same name is being unmounted elsewhere.
     * `"none"` is a special value that deactivates the view transition name under that condition.
     */
    var share: ViewTransitionClass?

    /**
     * Combined with [className] if the content of this `<ViewTransition>` has changed either due to DOM mutations or because an inner child has resized.
     * `"none"` is a special value that deactivates the view transition name under that condition.
     */
    var update: ViewTransitionClass?
}

/**
 * Opt-in for using [View Transitions](https://developer.mozilla.org/en-US/docs/Web/API/View_Transition_API) in React.
 * View Transitions only trigger for async updates like [startTransition], [useDeferredValue], Actions or <[Suspense]> revealing from fallback to content.
 * Synchronous updates provide an opt-out but also guarantee that they commit immediately which View Transitions can't.
 *
 * [`<ViewTransition>` reference documentation](https://react.dev/reference/react/ViewTransition)
 */
@ReactCanary
external val ViewTransition: ExoticComponent<ViewTransitionProps>
