// Automatically generated - do not modify!

package typescript

sealed external interface UpdateBundleProject<T : BuilderProgram> : InvalidatedProjectBase {
    override val kind: InvalidatedProjectKind.UpdateBundle
    fun emit(
        writeFile: WriteFileCallback = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): dynamic /* EmitResult | BuildInvalidedProject<T> */
}
