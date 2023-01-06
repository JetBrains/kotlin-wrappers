package js.core

/**
 * @constructor
 * Creates a finalization registry with an associated cleanup callback
 * @param cleanupCallback The callback to call after an object in the registry has been reclaimed.
 */
external class FinalizationRegistry<T>(
    cleanupCallback: (heldValue: T) -> Unit,
) {
    /**
     * Registers an object with the registry.
     * @param target The target object to register.
     * @param heldValue The value to pass to the finalizer for this object. This cannot be the
     * target object.
     * @param unregisterToken The token to pass to the unregister method to unregister the target
     * object. If provided (and not undefined), this must be an object. If not provided, the target
     * cannot be unregistered.
     */
    fun register(
        target: Any,
        heldValue: T,
        unregisterToken: Any = definedExternally,
    )

    /**
     * Unregisters an object from the registry.
     * @param unregisterToken The token that was used as the unregisterToken argument when calling
     * register to register the target object.
     */
    fun unregister(
        unregisterToken: Any,
    )
}
