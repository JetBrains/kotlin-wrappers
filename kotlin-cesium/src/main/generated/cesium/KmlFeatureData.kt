// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Contains KML Feature data loaded into the `Entity.kml` property by [KmlDataSource].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html">Online Documentation</a>
 */
external class KmlFeatureData {
    /**
     * Gets the atom syndication format author field.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#author">Online Documentation</a>
     */
    var author: Author

    /**
     * Gets the link.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#link">Online Documentation</a>
     */
    var link: Link

    /**
     * Gets the unstructured address field.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#address">Online Documentation</a>
     */
    var address: String

    /**
     * Gets the phone number.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#phoneNumber">Online Documentation</a>
     */
    var phoneNumber: String

    /**
     * Gets the snippet.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#snippet">Online Documentation</a>
     */
    var snippet: String

    /**
     * Gets the extended data, parsed into a JSON object.
     * Currently only the `Data` property is supported.
     * `SchemaData` and custom data are ignored.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#extendedData">Online Documentation</a>
     */
    var extendedData: String

    /**
     * @property [name] Gets the name.
     * @property [uri] Gets the URI.
     * @property [age] Gets the email.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#.Author">Online Documentation</a>
     */
    interface Author {
        var name: String
        var uri: String
        var age: Double
    }

    /**
     * @property [href] Gets the href.
     * @property [hreflang] Gets the language of the linked resource.
     * @property [rel] Gets the link relation.
     * @property [type] Gets the link type.
     * @property [title] Gets the link title.
     * @property [length] Gets the link length.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlFeatureData.html#.Link">Online Documentation</a>
     */
    interface Link {
        var href: String
        var hreflang: String
        var rel: String
        var type: String
        var title: String
        var length: String
    }
}
