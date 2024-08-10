// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface ModuleDetectionKind {
    companion object {
        /**
         * Files with imports, exports and/or import.meta are considered modules
         */
        val Legacy: ModuleDetectionKind

        /**
         * Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+
         */
        val Auto: ModuleDetectionKind

        /**
         * Consider all non-declaration files modules, regardless of present syntax
         */
        val Force: ModuleDetectionKind
    }
}
