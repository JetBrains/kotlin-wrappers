package electron


external interface SharedWorkerInfo {
// Docs: https://electronjs.org/docs/api/structures/shared-worker-info
    /**
     * The unique id of the shared worker.
     */
    var id: String

    /**
     * The url of the shared worker.
     */
    var url: String
}
