// Automatically generated - do not modify!

package vscode

/**
 * Options to configure the behavior of the input box UI.
 */
external interface InputBoxOptions {
    /**
    // ORIGINAL SOURCE


    /**
     * An optional string that represents the title of the input box.
    */
    title?: string;

    /**
     * The value to pre-fill in the input box.
    */
    value?: string;

    /**
     * Selection of the pre-filled {@linkcode InputBoxOptions.value value}. Defined as tuple of two number where the
     * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
     * pre-filled value will be selected, when empty (start equals end) only the cursor will be set,
     * otherwise the defined range will be selected.
    */
    valueSelection?: [number, number];

    /**
     * The text to display underneath the input box.
    */
    prompt?: string;

    /**
     * An optional string to show as placeholder in the input box to guide the user what to type.
    */
    placeHolder?: string;

    /**
     * Controls if a password input is shown. Password input hides the typed text.
    */
    password?: boolean;

    /**
     * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
     * This setting is ignored on iPad and is always false.
    */
    ignoreFocusOut?: boolean;

    /**
     * An optional function that will be called to validate input and to give a hint
     * to the user.
     *
     * @param value The current value of the input box.
     * @returns Either a human-readable string which is presented as an error message or an {@link InputBoxValidationMessage}
     *  which can provide a specific message severity. Return `undefined`, `null`, or the empty string when 'value' is valid.
    */
    validateInput?(value: string): string | InputBoxValidationMessage | undefined | null |
    Thenable<string | InputBoxValidationMessage | undefined | null>;

    // ORIGINAL SOURCE
     **/
}
