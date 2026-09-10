@file:JsModule("react")

package react

external interface FragmentProps :
    PropsWithChildren,
    PropsWithRef<FragmentInstance>

/**
 * [Online Documentation](https://react.dev/reference/react/Fragment)
 */
external val Fragment: ExoticComponent<FragmentProps>
