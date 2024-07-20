# Treating `package-lock.json`

Dependency locking is an important thing for build reproducibility.
But Gradle integration with NPM has some pitfalls,
so common troubleshooting scenarios are provided here.

## How does it work?

All NPM dependencies are stored in `build` directory.
This `build` directory is placed in the project root and ignored in Git.
Before installing of NPM dependencies a special Gradle task `kotlinRestorePackageLock`
moves `package-lock.json` to `build` directory.
So when you install NPM dependencies, concrete versions for the dependency tree will be taken from `package-lock.json`.
If you run some `build` command, `kotlinStorePackageLock` command will be executed.
On this stage if you don't have `package-lock.json` it will be stored.
If you have `package-lock.json`, `kotlinStorePackageLock` will check are there any differences
between `package-lock.json` from `build` directory and `package-lock.json` stored in the Git repository.
If there are any differences, you will receive an error.
It means you updated a version of some NPM dependency, but you forget to update `package-lock.json`
and now dependency installation is not reproducible.
Rough chain of Gradle tasks for any `build` command looks this way:

```text
Task :kotlinRestorePackageLock
Task :kotlinNpmInstall
Task :kotlinStorePackageLock
Task :<some-subproject>:build
```

## How to install NPM dependency

If you realize that you need some NPM dependency for some subproject, perform these steps:

* Fix a version of NPM library in `gradle.properties` in the project root.
* Declare NPM dependency in `build.gradle.kts` for subproject using `npmv` helper.
* Run Gradle command to update `package-lock.json` file:
  ```shell
  ./gradlew :kotlinUpgradePackageLock
  ```

## How to update NPM dependency

If you want to update a version for some NPM dependency, perform these steps:

* Change the version of NPM library in `gradle.properties` in the project root.
* Run Gradle command to update `package-lock.json` file:
  ```shell
  ./gradlew :kotlinUpgradePackageLock
  ```

## How to solve conflicts in `package-lock.json`

If you work on a pull request, and you changed `package-lock.json`,
there is a probability that you will face with conflicts in `package-lock.json`.
Perform these steps to solve such conflicts:

* If you have conflicts in `package-lock.json`, you can have conflicts in `gradle.properties`
  because a version you modified was modified in target branch also.
  You need to resolve these conflicts manually.
* Run Gradle command to update `package-lock.json` file:
  ```shell
  ./gradlew :kotlinUpgradePackageLock
  ```
  During dependency installation [NPM can solve conflicts](https://docs.npmjs.com/cli/v6/configuring-npm/package-locks#resolving-lockfile-conflicts)
  in `package-lock.json`, so this command will trigger dependency installation and `package-lock.json` updating.
* Run Git command to mark `package-lock.json` as file without conflicts:
  ```shell
  git add package-lock.json
  ```

## Other scenarios

If you face with a `package-lock.json` problem that was not described here,
please, describe it an issue or attach the description to pull request.
Your problem will be considered and repository maintainers will try to help you.
