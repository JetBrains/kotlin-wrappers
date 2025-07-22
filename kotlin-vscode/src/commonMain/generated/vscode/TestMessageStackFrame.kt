// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A stack frame found in the {@link TestMessage.stackTrace}.
 */
open external class TestMessageStackFrame {
    /**
    // ORIGINAL SOURCE

    /**
     * The location of this stack frame. This should be provided as a URI if the
     * location of the call frame can be accessed by the editor.
    */
    uri?: Uri;

    /**
     * Position of the stack frame within the file.
    */
    position?: Position;

    /**
     * The name of the stack frame, typically a method or function name.
    */
    label: string;

    /**
     * @param label The name of the stack frame
     * @param file The file URI of the stack frame
     * @param position The position of the stack frame within the file
    */
    constructor(label: string, uri?: Uri, position?: Position);

    // ORIGINAL SOURCE
     **/
}
