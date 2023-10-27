package node.childProcess


sealed external interface SpawnOptions : CommonSpawnOptions {
    var detached: Boolean?
}
