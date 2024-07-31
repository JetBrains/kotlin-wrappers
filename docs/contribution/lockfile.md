# Treating `package-lock.json`

Dependency locking is an important thing for build reproducibility.
But Gradle integration with NPM has some pitfalls,
so general workflow and approaches for maintenance of `package-lock.json` are described here.

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
If there are any differences, by default, you will receive an error.
It means you updated a version of some NPM dependency, but you forget to update `package-lock.json`
and now dependency installation is not reproducible.
Rough chain of Gradle tasks for any `build` command looks this way:

```text
Task :kotlinRestorePackageLock
Task :kotlinNpmInstall
Task :kotlinStorePackageLock
Task :<some-subproject>:build
```

## How we treat `package-lock.json` in Kotlin Wrappers

There are some specialties that makes maintenance of `package-lock.json` harder in the Kotlin Wrappers project:

* Using of a wrapped dependency version as part of a published artifact version.
* Using of a common version of Kotlin Wrappers as part of a published artifact version.
* Often releases of Kotlin Wrappers.

All this together provokes lots of conflicts in `package-lock.json`
and it makes contribution to Kotlin Wrappers really difficult.
That is why there is a custom approach to maintain `package-lock.json` in this repository.
Here is a description of the approximate flow of `package-lock.json` updating:

* Contributor changes or adds some versions of dependencies in `gradle.properties`.
* These changes appear in `master` branch (through pull request or direct commit).
* A special GitHub action triggers and performs these steps:
  * It produces an updated `package-lock.json` file.
  * It commits and pushes the new `package-lock.json` file to Git.
  * It creates pull request (or updates existing one) with the updated `package-lock.json` file.
  * One of the maintainers checks that there is nothing wrong with the updated `package-lock.json` file
    and merges the pull request.

## Exotic scenarios

If you face with some `package-lock.json` problem, please,
describe it in issue or attach the description to pull request.
Your problem will be considered and repository maintainers will try to help you.
