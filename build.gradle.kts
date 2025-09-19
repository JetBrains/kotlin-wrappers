plugins {
    id("wrappersbuild.security-overrides")
    id("wrappersbuild.react-npm-overrides")
}

tasks.wrapper {
    gradleVersion = "9.1.0"
}
