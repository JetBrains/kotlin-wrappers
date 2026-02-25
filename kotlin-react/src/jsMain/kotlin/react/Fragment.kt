@file:JsModule("react")

package react

import react.canary.ReactCanary

external interface FragmentProps :
    PropsWithChildren {
    /* PropsWithRef<FragmentInstance> */

    @ReactCanary
    var ref: Ref<FragmentInstance>?
}

/**
 * [Online Documentation](https://react.dev/reference/react/Fragment)
 */
external val Fragment: ExoticComponent<FragmentProps>
