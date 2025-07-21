// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents a location inside a resource, such as a line
 * inside a text file.
*/
export class Location {

/**
 * The resource identifier of this location.
*/
uri: Uri;

/**
 * The document range of this location.
*/
range: Range;

/**
 * Creates a new location object.
 *
 * @param uri The resource identifier.
 * @param rangeOrPosition The range or position. Positions will be converted to an empty range.
*/
constructor(uri: Uri, rangeOrPosition: Range | Position);
}

// ORIGINAL SOURCE
 **/
