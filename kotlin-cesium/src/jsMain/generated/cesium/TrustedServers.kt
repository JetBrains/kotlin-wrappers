// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A singleton that contains all of the servers that are trusted. Credentials will be sent with
 * any requests to these servers.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TrustedServers.html">Online Documentation</a>
 */
external object TrustedServers {
    /**
     * Adds a trusted server to the registry
     * ```
     * // Add a trusted server
     * TrustedServers.add('my.server.com', 80);
     * ```
     * @param [host] The host to be added.
     * @param [port] The port used to access the host.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TrustedServers.html#.add">Online Documentation</a>
     */
    fun add(
        host: String,
        port: Int,
    )

    /**
     * Removes a trusted server from the registry
     * ```
     * // Remove a trusted server
     * TrustedServers.remove('my.server.com', 80);
     * ```
     * @param [host] The host to be removed.
     * @param [port] The port used to access the host.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TrustedServers.html#.remove">Online Documentation</a>
     */
    fun remove(
        host: String,
        port: Int,
    )

    /**
     * Tests whether a server is trusted or not. The server must have been added with the port if it is included in the url.
     * ```
     * // Add server
     * TrustedServers.add('my.server.com', 81);
     *
     * // Check if server is trusted
     * if (TrustedServers.contains('https://my.server.com:81/path/to/file.png')) {
     *     // my.server.com:81 is trusted
     * }
     * if (TrustedServers.contains('https://my.server.com/path/to/file.png')) {
     *     // my.server.com isn't trusted
     * }
     * ```
     * @param [url] The url to be tested against the trusted list
     * @return Returns true if url is trusted, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TrustedServers.html#.contains">Online Documentation</a>
     */
    fun contains(url: String): Boolean

    /**
     * Clears the registry
     * ```
     * // Remove a trusted server
     * TrustedServers.clear();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TrustedServers.html#.clear">Online Documentation</a>
     */
    fun clear()
}
