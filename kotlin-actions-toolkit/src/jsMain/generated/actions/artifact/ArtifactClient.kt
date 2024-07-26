// Automatically generated - do not modify!

package actions.artifact

import js.array.ReadonlyArray
import js.promise.Promise

external interface ArtifactClient {
    /**
     * Uploads an artifact.
     *
     * @param name The name of the artifact, required
     * @param files A list of absolute or relative paths that denote what files should be uploaded
     * @param rootDirectory An absolute or relative file path that denotes the root parent directory of the files being uploaded
     * @param options Extra options for customizing the upload behavior
     * @returns single UploadArtifactResponse object
     */
    fun uploadArtifact(
        name: String,
        files: ReadonlyArray<String>,
        rootDirectory: String,
        options: UploadArtifactOptions = definedExternally,
    ): Promise<UploadArtifactResponse>

    /**
     * Lists all artifacts that are part of the current workflow run.
     * This function will return at most 1000 artifacts per workflow run.
     *
     * If `options.findBy` is specified, this will call the public List-Artifacts API which can list from other runs.
     * https://docs.github.com/en/rest/actions/artifacts?apiVersion=2022-11-28#list-workflow-run-artifacts
     *
     * @param options Extra options that allow for the customization of the list behavior
     * @returns ListArtifactResponse object
     */
    fun listArtifacts(options: ListArtifactsOptions /* & FindOptions */ = definedExternally): Promise<ListArtifactsResponse>

    /**
     * Finds an artifact by name.
     * If there are multiple artifacts with the same name in the same workflow run, this will return the latest.
     * If the artifact is not found, it will throw.
     *
     * If `options.findBy` is specified, this will use the public List Artifacts API with a name filter which can get artifacts from other runs.
     * https://docs.github.com/en/rest/actions/artifacts?apiVersion=2022-11-28#list-workflow-run-artifacts
     * `@actions/artifact` v2+ does not allow for creating multiple artifacts with the same name in the same workflow run.
     * It is possible to have multiple artifacts with the same name in the same workflow run by using old versions of upload-artifact (v1,v2 and v3), @actions/artifact < v2 or it is a rerun.
     * If there are multiple artifacts with the same name in the same workflow run this function will return the first artifact that matches the name.
     *
     * @param artifactName The name of the artifact to find
     * @param options Extra options that allow for the customization of the get behavior
     */
    fun getArtifact(
        artifactName: String,
        options: FindOptions = definedExternally,
    ): Promise<GetArtifactResponse>

    /**
     * Downloads an artifact and unzips the content.
     *
     * If `options.findBy` is specified, this will use the public Download Artifact API https://docs.github.com/en/rest/actions/artifacts?apiVersion=2022-11-28#download-an-artifact
     *
     * @param artifactId The id of the artifact to download
     * @param options Extra options that allow for the customization of the download behavior
     * @returns single DownloadArtifactResponse object
     */
    fun downloadArtifact(
        artifactId: Number,
        options: DownloadArtifactOptions /* & FindOptions */ = definedExternally,
    ): Promise<DownloadArtifactResponse>

    /**
     * Delete an Artifact
     *
     * If `options.findBy` is specified, this will use the public Delete Artifact API https://docs.github.com/en/rest/actions/artifacts?apiVersion=2022-11-28#delete-an-artifact
     *
     * @param artifactName The name of the artifact to delete
     * @param options Extra options that allow for the customization of the delete behavior
     * @returns single DeleteArtifactResponse object
     */
    fun deleteArtifact(
        artifactName: String,
        options: FindOptions = definedExternally,
    ): Promise<DeleteArtifactResponse>
}
