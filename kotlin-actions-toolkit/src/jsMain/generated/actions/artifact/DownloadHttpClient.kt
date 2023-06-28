// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClientResponse
import js.core.ReadonlyArray
import js.core.Void
import js.promise.Promise

external class DownloadHttpClient {
    constructor()

    /**
     * Gets a list of all artifacts that are in a specific container
     */
    fun listArtifacts(): Promise<ListArtifactsResponse>

    /**
     * Fetches a set of container items that describe the contents of an artifact
     * @param artifactName the name of the artifact
     * @param containerUrl the artifact container URL for the run
     */
    fun getContainerItems(
        artifactName: String,
        containerUrl: String,
    ): Promise<QueryArtifactResponse>

    /**
     * Concurrently downloads all the files that are part of an artifact
     * @param downloadItems information about what items to download and where to save them
     */
    fun downloadSingleArtifact(downloadItems: ReadonlyArray<DownloadItem>): Promise<Void>

    /**
     * Pipes the response from downloading an individual file to the appropriate destination stream while decoding gzip content if necessary
     * @param response the http response received when downloading a file
     * @param destinationStream the stream where the file should be written to
     * @param isGzip a boolean denoting if the content is compressed using gzip and if we need to decode it
     */
    fun pipeResponseToFile(
        response: HttpClientResponse,
        destinationStream: node.fs.WriteStream,
        isGzip: Boolean,
    ): Promise<Void>
}
