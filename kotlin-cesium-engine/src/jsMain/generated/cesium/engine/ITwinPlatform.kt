// Automatically generated - do not modify!

package cesium.engine

external object ITwinPlatform {
    /**
     * Status states for a mesh-export export.
     * Valid values are: <code>NotStarted</code>, <code>InProgress</code>, <code>Complete</code>, <code>Invalid</code>
     */
    interface ExportStatus

    /**
     * Types of mesh-export exports. CesiumJS only supports loading <code>3DTILES</code> type exports.
     * Valid values are: <code>IMODEL</code>, <code>CESIUM</code>, <code>3DTILES</code>
     */
    interface ExportType

    /**
     * Types of Reality data. This is a partial list of types we know we can support
     */
    interface RealityDataType

    /**
     * Gets or sets the default iTwin access token. This token should have the <code>itwin-platform</code> scope.
     */
    var defaultAccessToken: String?

    /**
     * Gets or sets the default iTwin API endpoint.
     */
    var apiEndpoint: Resource
}
