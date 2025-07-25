plugins {
    id("wrappersbuild.security-overrides")
    id("wrappersbuild.react-npm-overrides")
}

tasks.wrapper {
    gradleVersion = "8.14.3"
}
