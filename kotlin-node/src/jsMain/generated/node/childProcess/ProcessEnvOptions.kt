package node.childProcess


sealed external interface ProcessEnvOptions {
    var uid: Double?
    var gid: Double?
    var cwd: Any? /* string | URL | undefined */
    var env: node.process.ProcessEnv?
}
