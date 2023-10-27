package node.childProcess


sealed external interface CommonOptions : ProcessEnvOptions {
    /**
     * @default false
     */
    var windowsHide: Boolean?

    /**
     * @default 0
     */
    var timeout: Double?
}
