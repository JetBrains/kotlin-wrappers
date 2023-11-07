// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Parses a query string into an object, where the keys and values of the object are the
 * name/value pairs from the query string, decoded. If a name appears multiple times,
 * the value in the object will be an array of values.
 * ```
 * const obj = queryToObject('key1=some%20value&key2=a%2Fb&key3=x&key3=y');
 * // obj will be:
 * // {
 * //   key1 : 'some value',
 * //   key2 : 'a/b',
 * //   key3 : ['x', 'y']
 * // }
 * ```
 * @param [queryString] The query string.
 * @return An object containing the parameters parsed from the query string.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#queryToObject">Online Documentation</a>
 */
external fun queryToObject(queryString: String): Any
