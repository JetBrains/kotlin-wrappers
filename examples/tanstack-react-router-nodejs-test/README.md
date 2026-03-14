# tanstack-react-router-nodejs-test

* Examples to demonstrate how to use @testing-library/react to test react applications using @tanstack/react-router with
  the jsNodeTest task

* Environment used
    - node
    - mocha
    - global-jsdom

* Libraries used
    - react
    - @tanstack/react-router
    - kotlin-test
    - coroutines-test # when writing unit tests
    - @testing-library/react
    - @testing-library/user-event

## Issues

* `@testing-library/react` (RTL) expects to run in a `node`/`jsdom` environment to provide a browser-like environment.
  `Mocha` does not provide `jsdom` by default.
    - Work-around: Change `build.gradle.kts` to modify the test compilation’s generated `package.json` so that `Mocha`
      requires `global-jsdom`

* `@tanstack/react-router` requires `NODE_ENV=test` to run in a node/jsdom environment. By default, no `NODE_ENV` mode
  is set.
    - Work-around: Change `build.gradle.kts` to set `NODE_ENV=test` when running jsNodeTest

* `kotlinx.coroutines` will pick the wrong default dispatcher in a `node`/`jsdom` environment unless the user-agent
  contains `jsdom`.
    - Work-around: Change `build.gradle.kts` to modify the test compilation’s generated `package.json` so that `Mocha`
      requires
      `mocha-support/append-jsdom-to-user-agent-name.js`
    - This workaround may not be needed if you use coroutine-test and micromanage your test coroutines.

## Other considerations

* Writing tests will typically involve having a form of dependency injection. Integration tests will need to inject
  your testing scope into your effect hooks when launching coroutines.

## Run

```shell
cd ..
# in kotlin-wrappers/examples
./gradlew tanstack-react-router-nodejs-test:jsNodeTest
```

