// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * @since 2.0.0
 */
sealed external interface BaseDirectory {
    companion object {
        /**
         * @see {@link audioDir} for more information.
         */
        val Audio: BaseDirectory

        /**
         * @see {@link cacheDir} for more information.
         */
        val Cache: BaseDirectory

        /**
         * @see {@link configDir} for more information.
         */
        val Config: BaseDirectory

        /**
         * @see {@link dataDir} for more information.
         */
        val Data: BaseDirectory

        /**
         * @see {@link localDataDir} for more information.
         */
        val LocalData: BaseDirectory

        /**
         * @see {@link documentDir} for more information.
         */
        val Document: BaseDirectory

        /**
         * @see {@link downloadDir} for more information.
         */
        val Download: BaseDirectory

        /**
         * @see {@link pictureDir} for more information.
         */
        val Picture: BaseDirectory

        /**
         * @see {@link publicDir} for more information.
         */
        val Public: BaseDirectory

        /**
         * @see {@link videoDir} for more information.
         *
         * #### Platform-specific
         *
         * - **Android:** Resolves to the app-specific Movies directory since 2.12.0,
         *   see {@link videoDir}.
         */
        val Video: BaseDirectory

        /**
         * @see {@link resourceDir} for more information.
         */
        val Resource: BaseDirectory

        /**
         * @see {@link tempDir} for more information.
         */
        val Temp: BaseDirectory

        /**
         * @see {@link appConfigDir} for more information.
         */
        val AppConfig: BaseDirectory

        /**
         * @see {@link appDataDir} for more information.
         */
        val AppData: BaseDirectory

        /**
         * @see {@link appLocalDataDir} for more information.
         */
        val AppLocalData: BaseDirectory

        /**
         * @see {@link appCacheDir} for more information.
         */
        val AppCache: BaseDirectory

        /**
         * @see {@link appLogDir} for more information.
         */
        val AppLog: BaseDirectory

        /**
         * @see {@link desktopDir} for more information.
         *
         * #### Platform-specific
         *
         * - **Android:** Unsupported, this variant does not exist on Android.
         */
        val Desktop: BaseDirectory

        /**
         * @see {@link executableDir} for more information.
         *
         * #### Platform-specific
         *
         * - **Android:** Unsupported, this variant does not exist on Android.
         */
        val Executable: BaseDirectory

        /**
         * @see {@link fontDir} for more information.
         *
         * #### Platform-specific
         *
         * - **Android:** Unsupported, this variant does not exist on Android.
         */
        val Font: BaseDirectory

        /**
         * @see {@link homeDir} for more information.
         */
        val Home: BaseDirectory

        /**
         * @see {@link runtimeDir} for more information.
         *
         * #### Platform-specific
         *
         * - **Android:** Unsupported, this variant does not exist on Android.
         */
        val Runtime: BaseDirectory

        /**
         * @see {@link templateDir} for more information.
         *
         * #### Platform-specific
         *
         * - **Android:** Unsupported, this variant does not exist on Android.
         */
        val Template: BaseDirectory
    }
}
