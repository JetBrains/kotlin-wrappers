// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

/**
 * Since most requests are GET requests without bodies, Node.js provides this
 * convenience method. The only difference between this method and {@link request} is that it sets the method to GET and calls `req.end()`automatically. The callback must take care to consume the
 * response
 * data for reasons stated in {@link ClientRequest} section.
 *
 * The `callback` is invoked with a single argument that is an instance of {@link IncomingMessage}.
 *
 * JSON fetching example:
 *
 * ```js
 * http.get('http://localhost:8000/', (res) => {
 *   const { statusCode } = res;
 *   const contentType = res.headers['content-type'];
 *
 *   let error;
 *   // Any 2xx status code signals a successful response but
 *   // here we're only checking for 200.
 *   if (statusCode !== 200) {
 *     error = new Error('Request Failed.\n' +
 *                       `Status Code: ${statusCode}`);
 *   } else if (!/^application\/json/.test(contentType)) {
 *     error = new Error('Invalid content-type.\n' +
 *                       `Expected application/json but received ${contentType}`);
 *   }
 *   if (error) {
 *     console.error(error.message);
 *     // Consume response data to free up memory
 *     res.resume();
 *     return;
 *   }
 *
 *   res.setEncoding('utf8');
 *   let rawData = '';
 *   res.on('data', (chunk) => { rawData += chunk; });
 *   res.on('end', () => {
 *     try {
 *       const parsedData = JSON.parse(rawData);
 *       console.log(parsedData);
 *     } catch (e) {
 *       console.error(e.message);
 *     }
 *   });
 * }).on('error', (e) => {
 *   console.error(`Got error: ${e.message}`);
 * });
 *
 * // Create a local server to receive data from
 * const server = http.createServer((req, res) => {
 *   res.writeHead(200, { 'Content-Type': 'application/json' });
 *   res.end(JSON.stringify({
 *     data: 'Hello World!'
 *   }));
 * });
 *
 * server.listen(8000);
 * ```
 * @since v0.3.6
 * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`. Properties that are inherited from the prototype are ignored.
 */
external fun get(
    options: Any, /* RequestOptions | string | URL */
    callback: (res: IncomingMessage) -> Unit = definedExternally,
): ClientRequest


/**
 * Since most requests are GET requests without bodies, Node.js provides this
 * convenience method. The only difference between this method and {@link request} is that it sets the method to GET and calls `req.end()`automatically. The callback must take care to consume the
 * response
 * data for reasons stated in {@link ClientRequest} section.
 *
 * The `callback` is invoked with a single argument that is an instance of {@link IncomingMessage}.
 *
 * JSON fetching example:
 *
 * ```js
 * http.get('http://localhost:8000/', (res) => {
 *   const { statusCode } = res;
 *   const contentType = res.headers['content-type'];
 *
 *   let error;
 *   // Any 2xx status code signals a successful response but
 *   // here we're only checking for 200.
 *   if (statusCode !== 200) {
 *     error = new Error('Request Failed.\n' +
 *                       `Status Code: ${statusCode}`);
 *   } else if (!/^application\/json/.test(contentType)) {
 *     error = new Error('Invalid content-type.\n' +
 *                       `Expected application/json but received ${contentType}`);
 *   }
 *   if (error) {
 *     console.error(error.message);
 *     // Consume response data to free up memory
 *     res.resume();
 *     return;
 *   }
 *
 *   res.setEncoding('utf8');
 *   let rawData = '';
 *   res.on('data', (chunk) => { rawData += chunk; });
 *   res.on('end', () => {
 *     try {
 *       const parsedData = JSON.parse(rawData);
 *       console.log(parsedData);
 *     } catch (e) {
 *       console.error(e.message);
 *     }
 *   });
 * }).on('error', (e) => {
 *   console.error(`Got error: ${e.message}`);
 * });
 *
 * // Create a local server to receive data from
 * const server = http.createServer((req, res) => {
 *   res.writeHead(200, { 'Content-Type': 'application/json' });
 *   res.end(JSON.stringify({
 *     data: 'Hello World!'
 *   }));
 * });
 *
 * server.listen(8000);
 * ```
 * @since v0.3.6
 * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`. Properties that are inherited from the prototype are ignored.
 */
external fun get(
    url: Any, /* string | URL */
    options: RequestOptions,
    callback: (res: IncomingMessage) -> Unit = definedExternally,
): ClientRequest
