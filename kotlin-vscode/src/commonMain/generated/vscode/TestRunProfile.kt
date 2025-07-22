// Automatically generated - do not modify!

package vscode

/**
 * A TestRunProfile describes one way to execute tests in a {@link TestController}.
 */
external interface TestRunProfile {
    /**
     * Label shown to the user in the UI.
     *
     * Note that the label has some significance if the user requests that
     * tests be re-run in a certain way. For example, if tests were run
     * normally and the user requests to re-run them in debug mode, the editor
     * will attempt use a configuration with the same label of the `Debug`
     * kind. If there is no such configuration, the default will be used.
     */
//  label: string;

    /**
     * Configures what kind of execution this profile controls. If there
     * are no profiles for a kind, it will not be available in the UI.
     */
//  readonly kind: TestRunProfileKind;

    /**
     * Controls whether this profile is the default action that will
     * be taken when its kind is actioned. For example, if the user clicks
     * the generic "run all" button, then the default profile for
     * {@link TestRunProfileKind.Run} will be executed, although the
     * user can configure this.
     *
     * Changes the user makes in their default profiles will be reflected
     * in this property after a {@link onDidChangeDefault} event.
     */
//  isDefault: boolean;

    /**
     * Fired when a user has changed whether this is a default profile. The
     * event contains the new value of {@link isDefault}
     */
//  onDidChangeDefault: Event<boolean>;

    /**
     * Whether this profile supports continuous running of requests. If so,
     * then {@link TestRunRequest.continuous} may be set to `true`. Defaults
     * to false.
     */
//  supportsContinuousRun: boolean;

    /**
     * Associated tag for the profile. If this is set, only {@link TestItem}
     * instances with the same tag will be eligible to execute in this profile.
     */
//  tag: TestTag | undefined;

    /**
     * If this method is present, a configuration gear will be present in the
     * UI, and this method will be invoked when it's clicked. When called,
     * you can take other editor actions, such as showing a quick pick or
     * opening a configuration file.
     */
//  configureHandler: (() => void) | undefined;

    /**
     * Handler called to start a test run. When invoked, the function should call
     * {@link TestController.createTestRun} at least once, and all test runs
     * associated with the request should be created before the function returns
     * or the returned promise is resolved.
     *
     * If {@link supportsContinuousRun} is set, then {@link TestRunRequest.continuous}
     * may be `true`. In this case, the profile should observe changes to
     * source code and create new test runs by calling {@link TestController.createTestRun},
     * until the cancellation is requested on the `token`.
     *
     * @param request Request information for the test run.
     * @param cancellationToken Token that signals the used asked to abort the
     * test run. If cancellation is requested on this token, all {@link TestRun}
     * instances associated with the request will be
     * automatically cancelled as well.
     */
//  runHandler: (request: TestRunRequest, token: CancellationToken) => Thenable<void> | void;

    /**
     * An extension-provided function that provides detailed statement and
     * function-level coverage for a file. The editor will call this when more
     * detail is needed for a file, such as when it's opened in an editor or
     * expanded in the **Test Coverage** view.
     *
     * The {@link FileCoverage} object passed to this function is the same instance
     * emitted on {@link TestRun.addCoverage} calls associated with this profile.
     */
//  loadDetailedCoverage?: (testRun: TestRun, fileCoverage: FileCoverage, token: CancellationToken) => Thenable<FileCoverageDetail[]>;

    /**
     * An extension-provided function that provides detailed statement and
     * function-level coverage for a single test in a file. This is the per-test
     * sibling of {@link TestRunProfile.loadDetailedCoverage}, called only if
     * a test item is provided in {@link FileCoverage.includesTests} and only
     * for files where such data is reported.
     *
     * Often {@link TestRunProfile.loadDetailedCoverage} will be called first
     * when a user opens a file, and then this method will be called if they
     * drill down into specific per-test coverage information. This method
     * should then return coverage data only for statements and declarations
     * executed by the specific test during the run.
     *
     * The {@link FileCoverage} object passed to this function is the same
     * instance emitted on {@link TestRun.addCoverage} calls associated with this profile.
     *
     * @param testRun The test run that generated the coverage data.
     * @param fileCoverage The file coverage object to load detailed coverage for.
     * @param fromTestItem The test item to request coverage information for.
     * @param token A cancellation token that indicates the operation should be cancelled.
     */
//  loadDetailedCoverageForTest?: (testRun: TestRun, fileCoverage: FileCoverage, fromTestItem: TestItem, token: CancellationToken) => Thenable<FileCoverageDetail[]>;

    /**
     * Deletes the run profile.
     */
//  dispose(): void;
}
