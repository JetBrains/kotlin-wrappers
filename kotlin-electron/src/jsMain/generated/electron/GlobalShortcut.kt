package electron


external interface GlobalShortcut {
// Docs: https://electronjs.org/docs/api/global-shortcut
    /**
     * Whether this application has registered `accelerator`.
     *
     * When the accelerator is already taken by other applications, this call will
     * still return `false`. This behavior is intended by operating systems, since they
     * don't want applications to fight for global shortcuts.
     */
    fun isRegistered(accelerator: Accelerator): Boolean

    /**
     * Whether or not the shortcut was registered successfully.
     *
     * Registers a global shortcut of `accelerator`. The `callback` is called when the
     * registered shortcut is pressed by the user.
     *
     * When the accelerator is already taken by other applications, this call will
     * silently fail. This behavior is intended by operating systems, since they don't
     * want applications to fight for global shortcuts.
     *
     * The following accelerators will not be registered successfully on macOS 10.14
     * Mojave unless the app has been authorized as a trusted accessibility client:
     *
     * * "Media Play/Pause"
     * * "Media Next Track"
     * * "Media Previous Track"
     * * "Media Stop"
     */
    fun register(accelerator: Accelerator, callback: () -> Unit): Boolean

    /**
     * Registers a global shortcut of all `accelerator` items in `accelerators`. The
     * `callback` is called when any of the registered shortcuts are pressed by the
     * user.
     *
     * When a given accelerator is already taken by other applications, this call will
     * silently fail. This behavior is intended by operating systems, since they don't
     * want applications to fight for global shortcuts.
     *
     * The following accelerators will not be registered successfully on macOS 10.14
     * Mojave unless the app has been authorized as a trusted accessibility client:
     *
     * * "Media Play/Pause"
     * * "Media Next Track"
     * * "Media Previous Track"
     * * "Media Stop"
     */
    fun registerAll(accelerators: js.core.ReadonlyArray<Accelerator>, callback: () -> Unit): Unit

    /**
     * Unregisters the global shortcut of `accelerator`.
     */
    fun unregister(accelerator: Accelerator): Unit

    /**
     * Unregisters all of the global shortcuts.
     */
    fun unregisterAll(): Unit
}
