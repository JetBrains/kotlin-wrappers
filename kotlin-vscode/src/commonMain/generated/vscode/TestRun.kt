// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A TestRun represents an in-progress or completed test run and
 * provides methods to report the state of individual tests in the run.
*/
export interface TestRun {
/**
 * The human-readable name of the run. This can be used to
 * disambiguate multiple sets of results in a test run. It is useful if
 * tests are run across multiple platforms, for example.
*/
readonly name: string | undefined;

/**
 * A cancellation token which will be triggered when the test run is
 * canceled from the UI.
*/
readonly token: CancellationToken;

/**
 * Whether the test run will be persisted across reloads by the editor.
*/
readonly isPersisted: boolean;

/**
 * Indicates a test is queued for later execution.
 * @param test Test item to update.
*/
enqueued(test: TestItem): void;

/**
 * Indicates a test has started running.
 * @param test Test item to update.
*/
started(test: TestItem): void;

/**
 * Indicates a test has been skipped.
 * @param test Test item to update.
*/
skipped(test: TestItem): void;

/**
 * Indicates a test has failed. You should pass one or more
 * {@link TestMessage TestMessages} to describe the failure.
 * @param test Test item to update.
 * @param message Messages associated with the test failure.
 * @param duration How long the test took to execute, in milliseconds.
*/
failed(test: TestItem, message: TestMessage | readonly TestMessage[], duration?: number): void;

/**
 * Indicates a test has errored. You should pass one or more
 * {@link TestMessage TestMessages} to describe the failure. This differs
 * from the "failed" state in that it indicates a test that couldn't be
 * executed at all, from a compilation error for example.
 * @param test Test item to update.
 * @param message Messages associated with the test failure.
 * @param duration How long the test took to execute, in milliseconds.
*/
errored(test: TestItem, message: TestMessage | readonly TestMessage[], duration?: number): void;

/**
 * Indicates a test has passed.
 * @param test Test item to update.
 * @param duration How long the test took to execute, in milliseconds.
*/
passed(test: TestItem, duration?: number): void;

/**
 * Appends raw output from the test runner. On the user's request, the
 * output will be displayed in a terminal. ANSI escape sequences,
 * such as colors and text styles, are supported. New lines must be given
 * as CRLF (`\r\n`) rather than LF (`\n`).
 *
 * @param output Output text to append.
 * @param location Indicate that the output was logged at the given
 * location.
 * @param test Test item to associate the output with.
*/
appendOutput(output: string, location?: Location, test?: TestItem): void;

/**
 * Adds coverage for a file in the run.
*/
addCoverage(fileCoverage: FileCoverage): void;

/**
 * Signals the end of the test run. Any tests included in the run whose
 * states have not been updated will have their state reset.
*/
end(): void;

/**
 * An event fired when the editor is no longer interested in data
 * associated with the test run.
*/
onDidDispose: Event<void>;
}

// ORIGINAL SOURCE
 **/
